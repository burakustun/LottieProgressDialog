package com.burakustun.lottiedialog;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.burakustun.lottieprogressdialog.LottieDialogFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentManager fragmentManager = getFragmentManager();

        Button btnAnimation1 = findViewById(R.id.btnAnimation1);
        Button btnAnimation2 = findViewById(R.id.btnAnimation2);

        btnAnimation1.setOnClickListener( v -> {
            //create dialog with confetti animation
            //confetti.json file is located in src/main/assets
            DialogFragment lottieDialog = new LottieDialogFragment().newInstance("confetti.json");
            lottieDialog.show(fragmentManager,"lottieDialog");
        });

        //JAVA 7
        /*new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment lottieDialog = new LottieDialogFragment().newInstance("confetti.json");
                lottieDialog.show(fragmentManager,"lottieDialog");
            }
        }*/

        btnAnimation2.setOnClickListener( v -> {

            //create dialog with trophy animation, loop is disabled
            //trophy.json file is located in src/main/assets
            final DialogFragment lottieDialog = new LottieDialogFragment().newInstance("trophy.json",false);
            //make dialog not cancelable
            lottieDialog.setCancelable(false);
            lottieDialog.show(fragmentManager,"lottieDialog2");

            //DISMISS AFTER 5 SEC
            new Handler().postDelayed(lottieDialog::dismiss,5000);

        });

        //JAVA 7
        /*new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DialogFragment lottieDialog = new LottieDialogFragment().newInstance("trophy.json",false);
            lottieDialog.setCancelable(false);
            lottieDialog.show(fragmentManager,"lottieDialog2");

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    lottieDialog.dismiss();
                }
            },5000);
            }
        }*/

    }
}
