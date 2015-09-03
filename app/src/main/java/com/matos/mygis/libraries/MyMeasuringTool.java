package com.matos.mygis.libraries;

import android.graphics.Color;

import com.esri.android.map.MapView;
import com.esri.android.toolkit.analysis.MeasuringTool;
import com.esri.core.geometry.AreaUnit;
import com.esri.core.geometry.LinearUnit;
import com.esri.core.geometry.Unit;
import com.esri.core.symbol.SimpleFillSymbol;
import com.esri.core.symbol.SimpleLineSymbol;
import com.esri.core.symbol.SimpleMarkerSymbol;

/**
 * Created by matOS on 8/31/2015.
 */
public class MyMeasuringTool {

    private SimpleMarkerSymbol mMarkerSymbol;
    private SimpleFillSymbol mFillSymbol;
    private SimpleLineSymbol mLineSymbol;

    private Unit[] mLinearUnits;
    private Unit[] mAreaUnits;

    private MeasuringTool mMeasuringTool;
    private MapView mMapView;

    public MyMeasuringTool(MapView pMapView) {
        this.mMapView = pMapView;
        this.setDefaultValues();
    }

    private void setDefaultValues() {
        mMeasuringTool = new MeasuringTool(this.mMapView);

        this.setLinearUnits(new Unit[]{
                Unit.create(LinearUnit.Code.METER),
                Unit.create(LinearUnit.Code.KILOMETER),
                Unit.create(LinearUnit.Code.INCH),
                Unit.create(LinearUnit.Code.FOOT),
                Unit.create(LinearUnit.Code.YARD),
                Unit.create(LinearUnit.Code.MILE_STATUTE)
        });

        this.setAreaUnits(new Unit[]{
                Unit.create(AreaUnit.Code.SQUARE_METER),
                Unit.create(AreaUnit.Code.SQUARE_KILOMETER),
                Unit.create(AreaUnit.Code.SQUARE_INCH),
                Unit.create(AreaUnit.Code.SQUARE_FOOT),
                Unit.create(AreaUnit.Code.SQUARE_YARD),
                Unit.create(AreaUnit.Code.SQUARE_MILE_STATUTE),
                Unit.create(AreaUnit.Code.HECTARE)
        });

        this.setMarkerSymbol(new SimpleMarkerSymbol(Color.RED, 10, SimpleMarkerSymbol.STYLE.DIAMOND));
        this.setLineSymbol(new SimpleLineSymbol(Color.argb(100, 165, 42, 42), 3) );
        this.setFillSymbol(new SimpleFillSymbol(Color.argb(100, 0, 225, 255)) );
        this.mFillSymbol.setOutline(new SimpleLineSymbol(Color.TRANSPARENT, 0));

        this.mMeasuringTool.setLinearUnits(this.mLinearUnits);
        this.mMeasuringTool.setAreaUnits(this.mAreaUnits);

        this.mMeasuringTool.setMarkerSymbol(this.mMarkerSymbol);
        this.mMeasuringTool.setFillSymbol(this.mFillSymbol);
        this.mMeasuringTool.setLineSymbol(this.mLineSymbol);
    }

    public void setMarkerSymbol(SimpleMarkerSymbol pMarkerSymbol) {
        this.mMarkerSymbol = pMarkerSymbol;
    }

    public void setFillSymbol(SimpleFillSymbol pFillSymbol) {
        this.mFillSymbol = pFillSymbol;
    }

    public void setLineSymbol(SimpleLineSymbol pLineSymbol) {
        this.mLineSymbol = pLineSymbol;
    }

    public void setLinearUnits(Unit[] pLinearUnits) {
        this.mLinearUnits = pLinearUnits;
    }

    public void setAreaUnits(Unit[] pAreaUnits) {
        this.mAreaUnits = pAreaUnits;
    }

    public MeasuringTool getMeasuringTool() {
        return this.mMeasuringTool;
    }

}
