package com.sopan.recyclerviewanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class FullscreenImgActivity extends AppCompatActivity {

    ImageView imageView;
    String imagePath = "https://raw.githubusercontent.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen_img);

        imageView = findViewById(R.id.fullscreen_image);

        showImage();

    }

    private void showImage() {

        Picasso.with(this)
                .load(imagePath + "gitproject09/GridToListSwitch/master/screenshot/Q_add_talim.jpg")
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageView);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
