package edu.tacoma.uw.nm45;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "edu.tacoma.edu.nm45.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void writeText(View view) {
        Intent intent = new Intent(this, DisplayTextActivity.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        String message = "Nadir Mohamed\nI am graduating this quarter (spring 2020)\nI don't have a job lined up\nThis is my favorite class so far.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void displayImage(View view) {
        Intent intent = new Intent(this, DisplayImageActivity.class);
        startActivity(intent);
    }

    public void displayWebpage(View view) {
        //Intent intent = new Intent(this, DisplayWebpage.class);
        Uri webpage = Uri.parse("http://www.android.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void displayToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayDialog(View view) {
        ExDialog aDialog = new ExDialog();
        aDialog.show(getSupportFragmentManager(), "Dialog");
    }

}
