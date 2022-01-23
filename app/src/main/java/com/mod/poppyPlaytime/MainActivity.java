package com.mod.poppyPlaytime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.mod.poppyPlaytime.card1.card1_1;
import com.mod.poppyPlaytime.card2.card2_1;
import com.mod.poppyPlaytime.card3.card3_1;
import com.mod.poppyPlaytime.card4.card4_1;
import com.mod.poppyPlaytime.card5.card5_1;
import com.mod.poppyPlaytime.card6.card61;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;


public class MainActivity extends AppCompatActivity implements IUnityAdsInitializationListener{

    private String unityGameID = "4147749";
    private Boolean testMode = true;
    private String adUnitId = "Interstitial_Android";

    int Click ;

    private String adUnitIdReward = "Rewarded_Ad";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize the SDK:
        UnityAds.initialize(getApplicationContext(), unityGameID, testMode, this);


        CardView c1=(CardView)findViewById(R.id.c1);
        CardView c2=(CardView)findViewById(R.id.c2);
        CardView c3=(CardView)findViewById(R.id.c3);
        CardView c4=(CardView)findViewById(R.id.c4);
        CardView c5=(CardView)findViewById(R.id.c5);
        CardView c6=(CardView)findViewById(R.id.c6);
        CardView c7=(CardView)findViewById(R.id.c7);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Click=1;
                DisplayInterstitialAd();

            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click=2;
                DisplayInterstitialAd();

            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Click=3;
                DisplayInterstitialAd();
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Click=4;
                DisplayInterstitialAd();

            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Click=5;
                DisplayInterstitialAd();

            }
        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               DisplayRewardedAd();
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click=6;
                DisplayInterstitialAd();


            }
        });
    }


    private IUnityAdsLoadListener loadListener = new IUnityAdsLoadListener() {
        @Override
        public void onUnityAdsAdLoaded(String placementId) {
            UnityAds.show(MainActivity.this, adUnitId, new UnityAdsShowOptions(), showListener);
        }

        @Override
        public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {
            Log.e("UnityAdsExample", "Unity Ads failed to load ad for " + placementId + " with error: [" + error + "] " + message);

            if (Click==1) {
                Intent i = new Intent(getApplicationContext(), card1_1.class);
                startActivity(i);
            }else if (Click==2){

                Intent i2=new Intent(getApplicationContext(), card2_1.class);
                startActivity(i2);
            }else if (Click==3) {
                Intent i = new Intent(getApplicationContext(), card3_1.class);
                startActivity(i);
            }else if (Click==4){
                Intent i=new Intent(getApplicationContext(), card4_1.class);
                startActivity(i);
            }else if (Click==5) {
                Intent i = new Intent(getApplicationContext(), card5_1.class);
                startActivity(i);
            }else if (Click==6) {
                Intent i = new Intent(getApplicationContext(), moreOption.class);
                startActivity(i);
            }
        }
    };

    private IUnityAdsShowListener showListener = new IUnityAdsShowListener() {
        @Override
        public void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String message) {
            Log.e("UnityAdsExample", "Unity Ads failed to show ad for " + placementId + " with error: [" + error + "] " + message);

            if (Click==1) {
                Intent i = new Intent(getApplicationContext(), card1_1.class);
                startActivity(i);
            }else if (Click==2){

                Intent i2=new Intent(getApplicationContext(), card2_1.class);
                startActivity(i2);
            }else if (Click==3) {
                Intent i = new Intent(getApplicationContext(), card3_1.class);
                startActivity(i);
            }else if (Click==4){
                Intent i=new Intent(getApplicationContext(), card4_1.class);
                startActivity(i);
            }else if (Click==5) {
                Intent i = new Intent(getApplicationContext(), card5_1.class);
                startActivity(i);
            }else if (Click==6) {
                Intent i = new Intent(getApplicationContext(), moreOption.class);
                startActivity(i);
            }
        }

        @Override
        public void onUnityAdsShowStart(String placementId) {
            Log.v("UnityAdsExample", "onUnityAdsShowStart: " + placementId);
        }

        @Override
        public void onUnityAdsShowClick(String placementId) {
            Log.v("UnityAdsExample", "onUnityAdsShowClick: " + placementId);
        }

        @Override
        public void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
            Log.v("UnityAdsExample", "onUnityAdsShowComplete: " + placementId);



            if (Click==1) {
                Intent i = new Intent(getApplicationContext(), card1_1.class);
                startActivity(i);
            }else if (Click==2){

            Intent i2=new Intent(getApplicationContext(), card2_1.class);
            startActivity(i2);
            }else if (Click==3) {
                Intent i = new Intent(getApplicationContext(), card3_1.class);
                startActivity(i);
            }else if (Click==4){
            Intent i=new Intent(getApplicationContext(), card4_1.class);
            startActivity(i);
            }else if (Click==5) {
                Intent i = new Intent(getApplicationContext(), card5_1.class);
                startActivity(i);
            }else if (Click==6) {
                Intent i = new Intent(getApplicationContext(), moreOption.class);
                startActivity(i);
            }


        }
    };



    @Override
    public void onInitializationComplete() {
       // DisplayInterstitialAd();
    }

    @Override
    public void onInitializationFailed(UnityAds.UnityAdsInitializationError error, String message) {
        Log.e("UnityAdsExample", "Unity Ads initialization failed with error: [" + error + "] " + message);
    }

    // Implement a function to load an interstitial ad. The ad will start to show once the ad has been loaded.
    public void DisplayInterstitialAd () {
        UnityAds.load(adUnitId, loadListener);
    }

    public void DisplayRewardedAd () { UnityAds.load(adUnitIdReward, loadListenerReward); }





    private IUnityAdsLoadListener loadListenerReward = new IUnityAdsLoadListener() {
        @Override
        public void onUnityAdsAdLoaded(String placementId) {
            UnityAds.show(MainActivity.this, adUnitIdReward, new UnityAdsShowOptions(), showListenerReward);
        }

        @Override
        public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {
            Intent i=new Intent(getApplicationContext(), card61.class);
            startActivity(i);
            Log.e("UnityAdsExample", "Unity Ads failed to load ad for " + placementId + " with error: [" + error + "] " + message);
        }
    };

    private IUnityAdsShowListener showListenerReward = new IUnityAdsShowListener() {
        @Override
        public void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String message) {
            Log.e("UnityAdsExample", "Unity Ads failed to show ad for " + placementId + " with error: [" + error + "] " + message);
            Intent i=new Intent(getApplicationContext(), card61.class);
            startActivity(i);
        }

        @Override
        public void onUnityAdsShowStart(String placementId) {
            Log.v("UnityAdsExample", "onUnityAdsShowStart: " + placementId);
        }

        @Override
        public void onUnityAdsShowClick(String placementId) {
            Log.v("UnityAdsExample", "onUnityAdsShowClick: " + placementId);
        }

        @Override
        public void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
            Log.v("UnityAdsExample", "onUnityAdsShowComplete: " + placementId);
            Intent i=new Intent(getApplicationContext(), card61.class);
            startActivity(i);
            if (state.equals(UnityAds.UnityAdsShowCompletionState.COMPLETED)) {

                // Reward the user for watching the ad to completion
            } else {
                // Do not reward the user for skipping the ad
            }
        }
    };


}