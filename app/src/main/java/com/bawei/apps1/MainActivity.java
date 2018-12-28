package com.bawei.apps1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bawei.apps1.home.persenter.HomePersenter;
import com.bawei.apps1.home.view.IHomeView;

public class MainActivity extends AppCompatActivity implements IHomeView {

    private TextView viewById;
    private HomePersenter homePersenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = findViewById(R.id.texts);
        homePersenter = new HomePersenter(this);
        homePersenter.getModel();
    }


    @Override
    public void getViewData(String viewdata) {
        viewById.setText(viewdata);
    }
}
