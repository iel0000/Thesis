package com.crescent.thesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.wikitude.architect.ArchitectView;
import com.wikitude.architect.StartupConfiguration;

import java.io.IOException;

public class salakot extends AppCompatActivity {

    ArchitectView architectView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salakot);

        this.architectView = (ArchitectView)this.findViewById( R.id.architectView );
        final StartupConfiguration config = new StartupConfiguration("4ofLX14f3OdYyVtrbtGcsirlB+87nynwzri5FAhc90oS9B6R2YgjjzYGlySd98hOtWHXrWL29Cx3P26fR6vqVdFiKXKmRTaUrz7CnjFbWEMRg2riLMqJG9f0QM1CW+v6HkFkc3rAr6eFPmFCBCA7+dD5m0KhW8JtVBs+cKcugN1TYWx0ZWRfX0uSpekXxJYfwrAfx0Ov/6DSmVWYAdhFRTVZHgdsR6eFY4r/ScTnl70kCsy6fnSwHM6zdT1pGf3/A6Uqr3m7y0NvXJdIkZu4FXYdr/o3U+bRxiNzofnm5TL/7pMOpMRGqUN1g3Puc8CCErExOJsD8gaennaI6njZ4sccceGjScUzADFAWbJIxnRKIcWWfc8eHEBxPw4YbTiODnGvY1syh3TrTWzH1TAOXDRvt2WK2pUFtrNNDncaC1hYcnyQYiDlXRXTI8lBkuyDcTPPt3b/AFFcPre9BNybX34OmT+3lZskpqNR3zJAi5cZzNlYzUx/HEhnEWfw465/hTSM0TRuxDE+Z/4/g9J4W8Oa91w+soGrawkPH11OPvkhPOFOKvGGbq2tTCoLTXD+6q9+ekgnht06fz2BNZtAXYdhMM8JhjrvJLN1h/P4rN1Qm4/xq6j3EW4aAo8tDZXGzvo8xlYuaFs/HxjnouBNxjBFYQ/2YF88F/cqbeux+SU=");
        this.architectView.onCreate(config);

    }

    @Override
    protected void onPostCreate(final Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (this.architectView != null) {
            this.architectView.onPostCreate();
            try {
                this.architectView.load("salakot/index.html");

            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.architectView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.architectView.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.architectView.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
