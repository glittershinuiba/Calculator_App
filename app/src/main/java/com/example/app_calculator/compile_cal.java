package com.example.app_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

public class compile_cal extends AppCompatActivity {
    private boolean add=false,sub=false,mul=false,min=false;
    private Double num1=0.0,num2=0.0,num3=0.0;
    private Double result=0.0;
    private TextView screen_famul,screen_result;
    private String famul="",famul_all="",lastclick="",result_string;
    private Double result_min,result_mul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compile_cal);

        screen_famul = findViewById(R.id.famul);
        screen_result=findViewById(R.id.result2);


        WindowManager wm = getWindowManager();
        int width = wm.getDefaultDisplay().getWidth();
        int height = wm.getDefaultDisplay().getHeight();
        if(width<height){
            Intent intent_2=new Intent(this, MainActivity.class);
            startActivity(intent_2);
        }
        this.getSupportActionBar().hide();
    }
    public void button_0(View view) {
        famul+="0";
        famul_all+="0";
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

        if(add||sub||min||mul) {
            jisuan();
        }
    }
    public void button_1(View view) {
        famul+="1";
        famul_all+="1";
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

        if(add||sub||min||mul) {
            jisuan();
        }
    }
    public void button_2(View view) {
        famul+="2";
        famul_all+="2";
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

        if(add||sub||min||mul) {
            jisuan();
        }
    }
    public void button_3(View view) {
        famul+="3";
        famul_all+="3";
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

        if(add||sub||min||mul) {
            jisuan();
        }
    }
    public void button_4(View view) {
        famul+="4";
        famul_all+="4";
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

        if(add||sub||min||mul) {
            jisuan();
        }
    }
    public void button_5(View view) {
        famul+="5";
        famul_all+="5";
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

        if(add||sub||min||mul) {
            jisuan();
        }
    }
    public void button_6(View view) {
        famul+="6";
        famul_all+="6";
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

        if(add||sub||min||mul) {
            jisuan();
        }
    }
    public void button_7(View view) {
        famul+="7";
        famul_all+="7";
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

        if(add||sub||min||mul) {
            jisuan();
        }
    }
    public void button_8(View view) {
        famul+="8";
        famul_all+="8";
        screen_famul.setText(famul_all);
        result=num1;
        result_string = result.toString();
        screen_result.setText(result_string);

        if(add||sub||min||mul) {
            jisuan();
        }
    }
    public void button_9(View view) {
        famul+="9";
        famul_all+="9";
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

        if(add||sub||min||mul) {
            jisuan();
        }
    }
    public void button_dot(View view) {
        famul+=".";
        famul_all+=".";
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

        if(add||sub||min||mul) {
            jisuan();
        }
    }
    public void button_left(View view){
        famul_all+="(";
        num3=result;
        result=0.0;
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

    }
    public void button_right(View view){
        famul_all+=")";
        num2=result;
        famul="";
        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);
    }
    public void button_sin(View view){
        famul_all+="sin(";
        num3=result;
        result=0.0;
        famul="";


        screen_famul.setText(famul_all);
        result_string = result.toString();
        screen_result.setText(result_string);

    }

    public void button_add(View view) {
        if(famul==""){
            return;
        }
        add=true;
        sub=false;mul=false;min=false;
        //
        famul_all+="+";
        screen_famul.setText(famul_all);
        if(result==0.0) {
            num1 = Double.parseDouble(famul);
            num3=Double.parseDouble(famul);
            result=num1;
        }
        else {
            num3=result;
        }
        famul="";

        lastclick="+";

    }
    public void button_sub(View view) {
        if(famul==""){
            return;
        }
        sub=true;
        add=false;mul=false;min=false;
        //
        famul_all+="-";
        screen_famul.setText(famul_all);
        if(result==0.0) {
            num1 = Double.parseDouble(famul);
            num3=Double.parseDouble(famul);
            result=num1;
        }
        else {
            num3=result;
        }
        famul="";

        lastclick="-";
    }
    public void button_mul(View view) {
        if(famul==""){
            return;
        }
        mul=true;
        sub=false;add=false;min=false;
        //
        famul_all+="*";
        screen_famul.setText(famul_all);
        if(result==0.0) {
            num1 = Double.parseDouble(famul);
            num3=Double.parseDouble(famul);
            result=num1;
        }
        else if(lastclick=="+"){
            num3=result-num2;
            num1=Double.parseDouble(famul);
        }
        else if(lastclick=="-"){
            num3=result+num2;
            num1=Double.parseDouble(famul);
        }
        else {
            num3=result;
        }

        famul="";


    }
    public void button_min(View view) {
        if(famul==""){
            return;
        }
        min=true;
        sub=false;mul=false;add=false;
        //
        famul_all+="/";
        screen_famul.setText(famul_all);
        if(result==0.0) {
            num1 = Double.parseDouble(famul);
            num3=Double.parseDouble(famul);
            result=num1;
        }
        else if(lastclick=="+"){
            num3=result-num2;
            num1=Double.parseDouble(famul);
        }
        else if(lastclick=="-"){
            num3=result+num2;
            num1=Double.parseDouble(famul);
        }
        else {
            num3=result;
        }
        famul="";


    }
    public void clear_all(View view){
        if(famul==""){
            return;
        }
        add=false;sub=false;mul=false;min=false;
        num1=0.0;num2=0.0;num3=0.0;
        result=0.0;
        famul_all="";
        screen_famul.setText(famul_all);
        famul="";
        result_string=result.toString();
        screen_result.setText(result_string);

    }
    public void button_back(View view) {
        if (famul_all.length() == 0) {
            return;
        }
        if (famul.length() != 0) {
            famul = (String) famul.substring(0, famul.length() - 1);

        }
        if (famul_all.endsWith("+") || famul_all.endsWith("-") || famul_all.endsWith("*") || famul_all.endsWith("/")) {
            famul_all = famul_all.substring(0, famul_all.length() - 1);
        } else {
            famul_all = famul_all.substring(0, famul_all.length() - 1);
        }
        screen_famul.setText(famul_all);
    }
    public void jisuan(){

        if(famul==""){
            ;
        }
        else {
            num2 = Double.parseDouble(famul);
        }

            if (add || sub || mul || min) {
                if (add) {
                    result = num3 + num2;
                } else if (sub) {
                    result = num3 - num2;
                } else if (mul) {

                    result_mul = num1 * num2;
                    if (lastclick == "+") {
                        result = num3 + result_mul;
                    } else if (lastclick == "-") {
                        result = num3 - result_mul;
                    } else {
                        result = num1 * num2;
                    }
                } else if (min) {


                    result_min = num1 / num2;
                    if (lastclick == "+") {

                        result = num3 + result_min;
                    } else if (lastclick == "-") {
                        result = num3 - result_min;
                    } else {
                        result = num1 / num2;
                    }

                } else result = 0.0;
            } else return;



        result_string = result.toString();
        screen_result.setText(result_string);
    }


}
