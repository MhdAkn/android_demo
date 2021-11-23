package MhdAkn.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculatrice extends AppCompatActivity {

    public static String chiffreClick(String s) { return  s;}

    double chiffre=0;
    boolean update=false;
    boolean clickoperateur=false;
    public  String operateur="";
    double value1,value2;
    boolean crunPlus,crunMul,crunMoin,crunDiv,crunMod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);
        Button zero=(Button) findViewById(R.id.zero);
        Button un=(Button) findViewById(R.id.un);
        Button deux=(Button) findViewById(R.id.deux);
        Button trois=(Button) findViewById(R.id.trois);
        Button quatre=(Button) findViewById(R.id.quatre);
        Button cinq=(Button) findViewById(R.id.cinq);
        Button six=(Button) findViewById(R.id.six);
        Button sept=(Button) findViewById(R.id.sept);
        Button huit=(Button) findViewById(R.id.huit);
        Button neuf=(Button) findViewById(R.id.neuf);
        Button C=(Button) findViewById(R.id.AC);
        Button vi=(Button) findViewById(R.id.virgule);
        Button plus=(Button) findViewById(R.id.plus);
        Button moins=(Button) findViewById(R.id.moins);
        Button plusMoins=(Button) findViewById(R.id.plusMoins);
        Button fois=(Button) findViewById(R.id.fois);
        Button div=(Button) findViewById(R.id.div);
        Button mod=(Button) findViewById(R.id.mod);
        Button egal=(Button) findViewById(R.id.egal);
        EditText edit=(EditText) findViewById(R.id.edit);
        zero.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("0");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        un.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("1");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        deux.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("2");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        trois.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("3");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        quatre.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("4");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        cinq.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("5");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        six.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("6");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        sept.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("7");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        huit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("8");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        neuf.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick("9");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }
                    }
                }
        );
        vi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=chiffreClick(",");
                        String val=edit.getText().toString();
                        if(val==""){
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(val+var));
                        }

                    }
                }
        );
        C.setOnLongClickListener(
                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        edit.setText(String.valueOf(""));
                        return false;
                    }
                }
        );
        C.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String var=edit.getText().toString();
                        //edit.setText(String.valueOf(var));
                        if(var != null && var.length()>0){
                            var=var.substring(0,var.length()-1);
                            edit.setText(String.valueOf(var));
                        }else{
                            edit.setText(String.valueOf(""));
                        }
                    }
                }
        );
        plus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       /* if(clickoperateur){
                            chiffre=chiffre+Double.valueOf(edit.getText().toString()).doubleValue();
                            edit.setText(String.valueOf(chiffre));
                        }else{
                            chiffre = Double.valueOf(edit.getText().toString()).doubleValue();
                            clickoperateur = true;
                        }*/
                        value1=Double.parseDouble(edit.getText()+"");
                        crunPlus=true;
                        edit.setText(null);
                    };
                }
        );
        moins.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.parseDouble(edit.getText()+"");
                        crunMoin=true;
                        edit.setText(null);
                    }
                }
        );
        fois.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.parseDouble(edit.getText()+"");
                        crunMul=true;
                        edit.setText(null);
                    }
                }
        );
        div.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.parseDouble(edit.getText()+"");
                        crunDiv=true;
                        edit.setText(null);
                    }
                }
        );
        mod.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value1=Double.valueOf(edit.getText().toString()).doubleValue();
                        double value=value1*0.01;
                        edit.setText(String.valueOf(value));
                    }
                }
        );
        egal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        value2=Double.parseDouble(edit.getText()+"");
                        if(crunPlus==true){
                            edit.setText(value1+value2+"");
                            crunMul=false;
                        }
                        if(crunMoin==true){
                            edit.setText(value1-value2+"");
                            crunMoin=false;
                        }
                        if(crunMul==true){
                            edit.setText(value1*value2+"");
                            crunMul=false;
                        }
                        if(crunDiv==true){
                            edit.setText(value1/value2+"");
                            crunMul=false;
                        }


                    }
                }
        );
    }

}