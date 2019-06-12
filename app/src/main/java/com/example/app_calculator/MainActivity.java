package com.example.app_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
// import android.widget.Button;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //
    private TextView screen,screen_famual ;
    private TextView screen_result;
    String famula ="",famula_all="";
    String result_string;
    Double result=0.0;
    Double number_1 ,number_2;
    boolean add=false,Mul=false,Min=false,sub=false;

    {
        result = 0.0;
    }

    /*private Button button_0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonDot, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonC, buttonEqual;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=findViewById(R.id.famual);
        screen_result=findViewById(R.id.result2);
        screen_famual=findViewById(R.id.textView);

        //
        WindowManager wm = getWindowManager();
        int width = wm.getDefaultDisplay().getWidth();
        int height = wm.getDefaultDisplay().getHeight();
        if(width>height){
            Intent intent=new Intent(this, compile_cal.class);
            startActivity(intent);
        }
        }
    public void button_0(View view) {
        famula+="0";
        famula_all+="0";
        screen_famual.setText(famula_all);
        screen.setText(famula);

        result=0.0;
    }
    public void button_1(View view) {
        famula_all+="1";
        screen_famual.setText(famula_all);
        famula+="1";
        screen.setText(famula);

    }
    public void button_2(View view) {
        famula_all+="2";
        screen_famual.setText(famula_all);
        famula+="2";
        screen.setText(famula);
        result=0.0;
    }
    public void button_3(View view) {
        famula_all+="3";
        screen_famual.setText(famula_all);
        famula+="3";
        screen.setText(famula);
        result=0.0;
    }
    public void button_4(View view) {
        famula_all+="4";
        screen_famual.setText(famula_all);
        famula+="4";
        screen.setText(famula);
        result=0.0;
    }
    public void button_5(View view) {
        famula_all+="5";
        screen_famual.setText(famula_all);
        famula+="5";
        screen.setText(famula);
        result=0.0;
    }
    public void button_6(View view) {
        famula_all+="6";
        screen_famual.setText(famula_all);
        famula+="6";
        screen.setText(famula);
        result=0.0;
    }
    public void button_7(View view) {
        famula_all+="7";
        screen_famual.setText(famula_all);
        famula+="7";
        screen.setText(famula);
        result=0.0;
    }
    public void button_8(View view) {
        famula_all+="8";
        screen_famual.setText(famula_all);
        famula+="8";
        screen.setText(famula);
        result=0.0;
    }
    public void button_9(View view) {
        famula_all+="9";
        screen_famual.setText(famula_all);
        famula+="9";
        screen.setText(famula);
        result=0.0;
    }
    public void button_dot(View view) {
        if(result==0.0){
            famula+="0.";
            famula_all+="0.";
        }
        else {
            famula_all+=".";
            famula+=".";
        }

        screen_famual.setText(famula_all);

        screen.setText(famula);
        result=0.0;
    }
    public void button_back(View view){
        if(famula_all.length()==0){
            return;
        }
        if(famula.length()!=0) {
            famula = (String) famula.substring(0, famula.length() - 1);
            screen.setText(famula);
        }
        if(famula_all.endsWith("+")||famula_all.endsWith("-")||famula_all.endsWith("*")||famula_all.endsWith("/")){
            famula_all=famula_all.substring(0,famula_all.length()-1);
        }
        else {
            famula_all=famula_all.substring(0,famula_all.length()-1);
        }
        screen_famual.setText(famula_all);

    }
    public void button_add(View view){
        if(famula==""){
            return;
        }
        famula_all+="+";
        screen_famual.setText(famula_all);

        number_1=Double.parseDouble(famula);
        famula="";
        add=true;
        Mul=false;Min=false;sub=false;
    }

    public void button_Min(View view){
        if(famula==""){
            return;
        }
        famula_all+="-";
        screen_famual.setText(famula_all);
        number_1=Double.parseDouble(famula);
        famula="";
        Min=true;
        add=false;Mul=false;sub=false;
    }
    public void button_Mul(View view){
        if(famula==""){
            return;
        }
        famula_all+="*";
        screen_famual.setText(famula_all);
        number_1=Double.parseDouble(famula);
        famula="";
        Mul=true;
        add=false;Min=false;sub=false;
    }
    public void button_sub(View view){
        if(famula==""){
            return;
        }
        famula_all+="/";
        screen_famual.setText(famula_all);
        number_1=Double.parseDouble(famula);
        famula="";
        sub=true;
        add=false;Mul=false;Min=false;
    }
    public void button_equ(View view){
        if(famula==""){
            return;
        }
        number_2=Double.parseDouble(famula);

        if (add || sub || Mul || Min) {
            if (add) {
                result = number_1 + number_2;
            } else if (Min) {
                result = number_1 - number_2;
            } else if (Mul) {
                result = number_1 * number_2;
            } else if (sub) {
                result = number_1 / number_2;
            } else result = 0.0;
        } else return;
        result_string = result.toString();
        screen_result.setText(result_string);
        famula = result.toString();

    }
    public void clear_all(View view){
        if(famula==""){
            return;
        }
        result=0.0;
        famula_all="";
        screen_famual.setText(famula_all);
        famula="";
        result_string=result.toString();
        screen_result.setText(result_string);
        screen.setText(famula);
    }
    public void square(View view){
        if(famula==""){
            return;
        }
        if(result==0.0){
            result=Double.parseDouble(famula);

            result*=result;

        }
        else {
            result*=result;

        }
        result_string =result.toString() ;
        screen_result.setText(result_string);

    }

    public TextView getScreen_result() {
        return screen_result;
    }
}
