package com.example.alert;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.alnazer.bootstrap.alert.Alert;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showAlert(View view) {
        Alert.primary(getBaseContext(),"","Lorem Ipsum is simply dummy text of the printing and typesetting industry");
        Alert.success(getBaseContext(),"Test Message","Lorem Ipsum is simply dummy text of the printing and typesetting industry");
        Alert.danger(getBaseContext(),"Test Message","Lorem Ipsum is simply dummy text of the printing and typesetting industry");
        Alert.warning(getBaseContext(),"Test Message","Lorem Ipsum is simply dummy text of the printing and typesetting industry");
        Alert.info(getBaseContext(),"Test Message","Lorem Ipsum is simply dummy text of the printing and typesetting industry");
        Alert.light(getBaseContext(),"Test Message","Lorem Ipsum is simply dummy text of the printing and typesetting industry");
        Alert.dark(getBaseContext(),"Test Message","Lorem Ipsum is simply dummy text of the printing and typesetting industry");
        Alert.secondary(getBaseContext(),"Test Message","Lorem Ipsum is simply dummy text of the printing and typesetting industry");
    }
}