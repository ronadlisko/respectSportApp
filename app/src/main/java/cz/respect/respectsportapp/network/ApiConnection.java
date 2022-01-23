package cz.respect.respectsportapp.network;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class ApiConnection {

    public String user = "sdafdfsdfsf";
    private String url ="http://10.0.2.2/respect_table_tennis/www/98789789789079889789/login";
    public StringRequest stringObjectRequest;
    public String stringResponse;
    Context context;
    ApiListener listener = null;
    RequestQueue queue;

    public ApiConnection(Context context, ApiListener listener) {
        this.context = context;
        this.listener = listener;
        //requestQueue = Volley.newRequestQueue(context);
    }

        public void connectString() {
        queue = Volley.newRequestQueue(this.context);
        stringObjectRequest = new StringRequest
                (Request.Method.POST, url, new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        Log.i("Response OK", response.toString());
                        listener.onApiResponse(response.toString());
                        //stringResponse = response.toString();
                        //textView.setText("Response: " + response.toString());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("Response Error", "Connection to the server failed");
                        stringResponse = "ERROR";
                        // TODO: Handle error

                    }
                });
        queue.add(stringObjectRequest);
    }

    public String getStringResult() {
        return this.stringResponse;
    }

    public StringRequest getRequest() {
        return this.stringObjectRequest;
    }
    //queue.add(stringRequest);

    public void connectJson() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.POST, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("Response OK", response.toString());
                        //textView.setText("Response: " + response.toString());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("Response Error", error.getMessage());
                        // TODO: Handle error

                    }
                });
    }
}
