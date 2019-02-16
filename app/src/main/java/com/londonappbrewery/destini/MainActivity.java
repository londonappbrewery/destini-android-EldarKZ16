package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

    }

    public void buttonTopClick(View v){

        if (mButtonTop.getText().equals(getString(R.string.T1_Ans1)) || mButtonTop.getText().equals(getString(R.string.T2_Ans1))){

            updateQuestion(getString(R.string.T3_Story), getString(R.string.T3_Ans1), getString(R.string.T3_Ans2));

        } else if (mButtonTop.getText().equals(getString(R.string.T3_Ans1))){

            updateQuestion(getString(R.string.T6_End), null, null);

        }
    }

    public void buttonBottomClick(View v){

        if (mButtonBottom.getText().equals(getString(R.string.T1_Ans2))){

            updateQuestion(getString(R.string.T2_Story), getString(R.string.T2_Ans1), getString(R.string.T2_Ans2));

        } else if (mButtonBottom.getText().equals(getString(R.string.T2_Ans2))){

            updateQuestion(getString(R.string.T4_End), null, null);

        } else if (mButtonBottom.getText().equals(getString(R.string.T3_Ans2))){

            updateQuestion(getString(R.string.T5_End), null, null);

        }

    }

    private void updateQuestion(String nextStory, String nextButtonTop, String nextButtonBottom){
        mStoryTextView.setText(nextStory);

        if (nextButtonTop != null) {
            mButtonTop.setText(nextButtonTop);
        } else {
            mButtonTop.setVisibility(View.GONE);
        }

        if (nextButtonBottom != null) {
            mButtonBottom.setText(nextButtonBottom);
        } else {
            mButtonBottom.setVisibility(View.GONE);
        }
    }
}
