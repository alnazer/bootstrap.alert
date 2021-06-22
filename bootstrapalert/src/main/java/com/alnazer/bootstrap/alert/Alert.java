package com.alnazer.bootstrap.alert;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Alert {
    private static final int SUCCESS = Color.parseColor("#d1e7dd");
    private static final int TEXT_SUCCESS = Color.parseColor("#155724");

    private static final int PRIMARY = Color.parseColor("#cce5ff");
    private static final int TEXT_PRIMARY = Color.parseColor("#004085");

    private static final int SECONDARY = Color.parseColor("#383d41");
    private static final int TEXT_SECONDARY = Color.parseColor("#d6d8db");

    private static final int DANGER = Color.parseColor("#f8d7da");
    private static final int TEXT_DANGER = Color.parseColor("#721c24");

    private static final int WARNING = Color.parseColor("#fff3cd");
    private static final int TEXT_WARNING = Color.parseColor("#856404");

    private static final int INFO = Color.parseColor("#d1ecf1");
    private static final int TEXT_INFO = Color.parseColor("#0c5460");

    private static final int LIGHT = Color.parseColor("#fefefe");
    private static final int TEXT_LIGHT = Color.parseColor("#818182");

    private static final int DARK = Color.parseColor("#d6d8d9");
    private static final int TEXT_DARK = Color.parseColor("#1b1e21");

    public static void success(Context context, String title, String message){
        Toast alert = showAlert(context, title, message,R.drawable.ic_alert_success, SUCCESS,TEXT_SUCCESS);
        alert.show();
    }

    public static void primary(Context context, String title, String message){
        Toast alert = showAlert(context, title, message,R.drawable.ic_alert_exclamation, PRIMARY,TEXT_PRIMARY);
        alert.show();
    }
    public static void secondary(Context context, String title, String message){
        Toast alert = showAlert(context, title, message,R.drawable.ic_alert_secondary, SECONDARY,TEXT_SECONDARY);
        alert.show();
    }
    public static void danger(Context context, String title, String message){
        Toast alert = showAlert(context, title, message,R.drawable.ic_alert_error, DANGER,TEXT_DANGER);
        alert.show();
    }
    public static void warning(Context context, String title, String message){
        Toast alert = showAlert(context, title, message,R.drawable.ic_alert_warning, WARNING,TEXT_WARNING);
        alert.show();
    }
    public static void info(Context context, String title, String message){
        Toast alert = showAlert(context, title, message,R.drawable.ic_alert_info, INFO,TEXT_INFO);
        alert.show();
    }
    public static void light(Context context, String title, String message){
        Toast alert = showAlert(context, title, message,R.drawable.ic_alert_light, LIGHT,TEXT_LIGHT);
        alert.show();
    }
    public static void dark(Context context, String title, String message){
        Toast alert = showAlert(context, title, message,R.drawable.ic_alert_dark, DARK,TEXT_DARK);
        alert.show();
    }

    public static  Toast showAlert(Context context, String title, String message, int icon, int backgroundColor, int textColor){

        // set view
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View alert_layout = inflater.inflate( R.layout.alert, null );

        TextView alert_title = alert_layout.findViewById(R.id.alert_title);
        alert_title.setText(title);
        if(title == null || title.equals("")){
            alert_title.setVisibility(View.GONE);
        }
        alert_title.setTextColor(textColor);

        TextView alert_message = alert_layout.findViewById(R.id.alert_message);
        if(message == null || message.equals("")){
            alert_message.setVisibility(View.GONE);
        }
        alert_message.setText(message);
        alert_message.setTextColor(textColor);

        ImageView alert_icon = alert_layout.findViewById(R.id.icon);
        alert_icon.setImageDrawable(context.getResources().getDrawable(icon));
        LinearLayout alert_box = alert_layout.findViewById(R.id.laert_parent_box);
        alert_box.setBackgroundColor(backgroundColor);
        // define alert
        Toast alert = new Toast(context);
        alert.setView(alert_layout);
        alert.setGravity(Gravity.BOTTOM|Gravity.FILL_HORIZONTAL,0,0);
        return alert;
    }





}
