package com.example.galux.e_orders2;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    String val = "{\n" +
            "  \"menu_item\": [\n" +
            "    {\n" +
            "      \"category\": \"ΣΑΛΑΤΑ\",\n" +
            "      \"cost\": 5.5,\n" +
            "      \"menu_id\": 1,\n" +
            "      \"product_id\": \"ΚΡΗΤΙΚΗ\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"category\": \"ΣΑΛΑΤΑ\",\n" +
            "      \"cost\": 6,\n" +
            "      \"menu_id\": 2,\n" +
            "      \"product_id\": \"ΦΑΚΗ\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"category\": \"ΣΑΛΑΤΑ\",\n" +
            "      \"cost\": 4.5,\n" +
            "      \"menu_id\": 3,\n" +
            "      \"product_id\": \"ΚΟΥΣ-ΚΟΥΣ\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"category\": \"ΣΑΛΑΤΑ\",\n" +
            "      \"cost\": 5,\n" +
            "      \"menu_id\": 4,\n" +
            "      \"product_id\": \"ΡΟΚΑ\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"category\": \"ΣΑΛΑΤΑ\",\n" +
            "      \"cost\": 5.5,\n" +
            "      \"menu_id\": 5,\n" +
            "      \"product_id\": \"ΑΝΑΜΕΙΚΤΗ ΣΑΛΑΤΑ\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"category\": \"ΜΠΙΝΕΛΙΚΙΑ\",\n" +
            "      \"cost\": 3,\n" +
            "      \"menu_id\": 6,\n" +
            "      \"product_id\": \"ΠΑΤΑΤΑ ΟΦΤΗ\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"category\": \"ΜΠΙΝΕΛΙΚΙΑ\",\n" +
            "      \"cost\": 3,\n" +
            "      \"menu_id\": 7,\n" +
            "      \"product_id\": \"ΠΑΤΑΤΑ ΤΗΓΑΝΗΤΗ\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"category\": \"ΜΠΙΝΕΛΙΚΙΑ\",\n" +
            "      \"cost\": 4.5,\n" +
            "      \"menu_id\": 8,\n" +
            "      \"product_id\": \"ΝΤΑΚΟΣ\"\n" +
            "    }}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        LinearLayout layout = (LinearLayout) findViewById(R.id.linlay);

        try {
            JSONObject ti = new JSONObject(val);
            JSONArray menu_array = ti.optJSONArray("menu_item");

            LinearLayout.LayoutParams bdsmparams1=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT,1);

            for (int j=0; j < menu_array.length(); j++){
                JSONObject item = menu_array.getJSONObject(j);
                int menuID = Integer.parseInt(item.optString("menu_id").toString());
                final Button tsapou = new Button(getApplicationContext());
                tsapou.setLayoutParams(bdsmparams1);
                tsapou.setText(menuID);
                tsapou.setId(j);
                tsapou.setBackgroundColor(Color.RED);
                bdsmparams1.setMargins(10,10,0,0);

                layout.addView(tsapou);

            }
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }

//        for (int i = 0; i <10; i++){
////            LinearLayout.LayoutParams rowParams=new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT,1);
//            LinearLayout.LayoutParams bdsmparams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT,1);
//
//////            LinearLayout row = new LinearLayout(getApplicationContext());
////            Button emptyBtn = new Button(getApplicationContext());
////            emptyBtn.setLayoutParams(btnParams);
////
////            // set the empty useless buttons to a trasparent color
////            int color = Color.TRANSPARENT; // set color to tranparent
////            Drawable background = emptyBtn.getBackground();
////            if (background instanceof ColorDrawable) { color = ((ColorDrawable) background).getColor();}
////            emptyBtn.setBackgroundColor(color);
//////            row.addView(emptyBtn);
//
//            final Button kolaraki = new Button(getApplicationContext());
//            kolaraki.setLayoutParams(bdsmparams);
////            kolaraki.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
//            kolaraki.setText("orxeis" + i);
//            kolaraki.setId(i);
//            kolaraki.setBackgroundColor(Color.RED);
//            bdsmparams.setMargins(10,10,0,0);
//            if(layout!=null){
//                layout.addView(kolaraki);
//            }
//
//        }

    }
}
