package com.matos.mygis.tasks;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by matOS on 8/27/2015.
 */
public class SplashTask extends AsyncTask<String, Integer, Void> {

    private static final String TAG = "SplashTask";
    private SplashListener mListener;

    public interface SplashListener {
        public void onTaskUpdated(int progres);
        public void onTaskFinished(String message, String data);
    }

    public SplashTask(SplashListener pSplashListener) {
        this.mListener = pSplashListener;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.i(TAG, "onPreExecute");
    }

    @Override
    protected Void doInBackground(String... params) {
        Log.i(TAG, "doInBackground");

        try {

            if (params[0].equals("")) {
                int i = 0;
                while (i <= 100) {
                    Thread.sleep(500);
                    publishProgress(i);
                    i = i + 10;
                }
            }

        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        Log.i(TAG, "onProgressUpdate");
        mListener.onTaskUpdated(values[0]);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Log.i(TAG, "onPostExecute");
        mListener.onTaskFinished("", "");
    }
}
