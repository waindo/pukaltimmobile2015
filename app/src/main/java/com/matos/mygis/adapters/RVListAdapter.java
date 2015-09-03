package com.matos.mygis.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.matos.mygis.R;
import com.matos.mygis.database.models.Layer;
import com.matos.mygis.fragments.FListLayer;

import java.util.List;

/**
 * Created by matOS on 7/30/2015.
 */
public class RVListAdapter extends RecyclerView.Adapter<RVListAdapter.LayerViewHolder> {

    private final static String TAG = "RVListAdapter";


    private FListLayer.FListLayerListener mListener;
    private List<Layer> mLayers;
    private int selectedItem = -1;
    private int selectedUrutan;

    public class LayerViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTeksTampil, tvIdLayer, tvNamaGrup, tvUrutan;
        private ToggleButton tbOnOffLayer, tbIsGrupLayer;
        private LinearLayout linLayer;

        private final View.OnClickListener onTeksClickListener
                = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean is_grup_layer = ((ToggleButton) v.findViewById(R.id.tbIsGrupLayer)).isChecked();
                int id = Integer.parseInt(((TextView) v.findViewById(R.id.tvIdLayer)).getText().toString());
                int urutan = Integer.parseInt(((TextView) v.findViewById(R.id.tvUrutan)).getText().toString());

                if (is_grup_layer) {
                    String nama_grup = ((TextView) v.findViewById(R.id.tvNamaGrup)).getText().toString();
                    Log.i(TAG, "List item (id: " + id
                            + ") di posisi " + getPosition()
                            + " adalah grup layer. Akan buka detail layer...");
                    mListener.onItemTextCicked(id, urutan, nama_grup);
                }
                else {
                    if (selectedItem == getPosition()) {
                        Log.i(TAG, "unselected item " + selectedItem + ", id: " + id);
                        v.setSelected(false);
                        selectedItem = -1;
                        urutan = -1;
                    }
                    else {
                        selectedItem = getPosition();
                        v.setSelected(true);
                        Log.i(TAG, "selected item: " + selectedItem + ", id: " + id);
                    }
                    mListener.onItemTextCicked(id, urutan, "");
                }
            }
        };

        private final CompoundButton.OnCheckedChangeListener onCheckedLayerListener
                = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                View parent = (View) buttonView.getParent();
                int id = Integer.parseInt(((TextView) parent.findViewById(R.id.tvIdLayer)).getText().toString());
                boolean is_grup_layer = ((ToggleButton) parent.findViewById(R.id.tbIsGrupLayer)).isChecked();
                String nama_grup = ((TextView) parent.findViewById(R.id.tvNamaGrup)).getText().toString();

                Log.i(TAG, "togglebutton " + id + " changed from " + !isChecked + " to " + isChecked);

                mListener.onToggleButtonClicked(id, is_grup_layer, nama_grup, isChecked);
            }
        };

        public LayerViewHolder(View itemView) {
            super(itemView);
            linLayer = (LinearLayout) itemView.findViewById(R.id.linLayer);
            tvTeksTampil = (TextView) itemView.findViewById(R.id.tvTeksTampil);
            tvUrutan = (TextView) itemView.findViewById(R.id.tvUrutan);
            tvIdLayer = (TextView) itemView.findViewById(R.id.tvIdLayer);
            tvNamaGrup = (TextView) itemView.findViewById(R.id.tvNamaGrup);
            tbOnOffLayer = (ToggleButton) itemView.findViewById(R.id.tbOnOffLayer);
            tbIsGrupLayer = (ToggleButton) itemView.findViewById(R.id.tbIsGrupLayer);

            linLayer.setOnClickListener(onTeksClickListener);
            tbOnOffLayer.setOnCheckedChangeListener(onCheckedLayerListener);
        }

    }

    public RVListAdapter(List<Layer> pLayers, FListLayer.FListLayerListener listener) {
        this.mLayers = pLayers;
        this.mListener = listener;
    }

    @Override
    public LayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cv_list_layer, parent, false);
        LayerViewHolder lvh = new LayerViewHolder(view);
        return lvh;
    }

    @Override
    public void onBindViewHolder(LayerViewHolder holder, int position) {
        holder.tvTeksTampil.setText(mLayers.get(position).getTeks_tampil());
        holder.tvUrutan.setText(String.valueOf(mLayers.get(position).getUrutan()));
        holder.tvIdLayer.setText(String.valueOf(mLayers.get(position).getId()));
        holder.tvNamaGrup.setText(mLayers.get(position).getNama_grup());
        holder.tbOnOffLayer.setChecked(mLayers.get(position).isOn_off());
        holder.tbIsGrupLayer.setChecked(mLayers.get(position).is_grup_layer());
        holder.linLayer.setSelected(false);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return this.mLayers.size();
    }
}
