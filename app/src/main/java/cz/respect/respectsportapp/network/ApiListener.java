package cz.respect.respectsportapp.network;

public interface ApiListener {
    void onApiResponse(String response);
    void onTokenResponse(String response);
}
