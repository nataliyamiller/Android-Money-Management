package com.epicodus.moneymanagement.ui;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.moneymanagement.R;
import com.epicodus.moneymanagement.models.InfoLib;
import com.epicodus.moneymanagement.models.MoreInfo;

public class InfoActivity extends AppCompatActivity {

    private TextView mDescriptionLabel;
    private ImageView mDescriptionImage;
    private Button mHintButton;
    private Button mRegisterInfoButton;

    private InfoLib mInfoLib;
    private MoreInfo mCurrentInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        mDescriptionLabel = (TextView) findViewById(R.id.descriptionLabel);
        mDescriptionImage = (ImageView) findViewById(R.id.descriptionImage);
        mHintButton = (Button) findViewById(R.id.hintButton);
        mRegisterInfoButton = (Button) findViewById(R.id.registerInfoButton);

        mInfoLib = new InfoLib();
        mCurrentInfo = mInfoLib.getMoreInfos().get(0);
        
        setLayoutContent();

        mHintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentInfo = mInfoLib.nextInfo(mCurrentInfo);
                setLayoutContent();
            }
        });

        mRegisterInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });


    }

    private void setLayoutContent() {
        mDescriptionLabel.setText(mCurrentInfo.getDescription());
        mDescriptionImage.setImageResource(mCurrentInfo.getImage());
    }


}
