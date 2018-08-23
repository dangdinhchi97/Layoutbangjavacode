package edu.green.acedemy.layoutbangjavacode;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LayOutjavacode_Activity extends AppCompatActivity {
private LinearLayout linearlayoutroot;
private RelativeLayout relatielayoutroot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createLinearLayoutView();
        createRelaTiveLayout();
        setContentView(relatielayoutroot);
        //setContentView(linearlayoutroot);
    }

    @SuppressLint("SetTextI18n")
    public void createRelaTiveLayout(){
        //relativeLayoutroot
        relatielayoutroot=new RelativeLayout(this);
        //relativeLayoutSub
        RelativeLayout relativelayoutsub=new RelativeLayout(this);
        LinearLayout.LayoutParams relativelayoutParamsub=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        relativelayoutsub.setId(R.id.rl);

        //Image view
        ImageView imageViewavrtar=new ImageView(this);
        imageViewavrtar.setLayoutParams(relativelayoutParamsub);
        imageViewavrtar.setId(R.id.ima);
        imageViewavrtar.setImageResource(R.mipmap.ic_launcher);
        //textview
        TextView tv=new TextView(this);
        RelativeLayout.LayoutParams relativelayouttv=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        relativelayouttv.addRule(RelativeLayout.CENTER_VERTICAL);
        relativelayouttv.setMargins(20,0,0,0);
        relativelayouttv.addRule(RelativeLayout.RIGHT_OF,imageViewavrtar.getId());
        tv.setText(getString(R.string.textvi));
        tv.setLayoutParams(relativelayouttv);

        //add hai cai con vai cai cha RelativeLayoutsubn he
        relativelayoutsub.addView(imageViewavrtar);
        relativelayoutsub.addView(tv);

        //buttton
        Button bt=new Button(this);
        RelativeLayout.LayoutParams rebt=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        rebt.addRule(RelativeLayout.BELOW,relativelayoutsub.getId());
        rebt.addRule(RelativeLayout.CENTER_HORIZONTAL);
        bt.setPadding(10,10,10,10);
        bt.setText(getString(R.string.btnClick));

        //button ahhii do ngoc
        Button bt1=new Button(this);
        RelativeLayout.LayoutParams reebt=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        reebt.addRule(RelativeLayout.BELOW,relativelayoutsub.getId());
        reebt.addRule(RelativeLayout.CENTER_HORIZONTAL);
        reebt.setMargins(0,100,0,0);
        bt1.setText(getString(R.string.btnahihi));


        //add vao ben trong thang reletive layout
        relatielayoutroot.addView(relativelayoutsub,relativelayoutParamsub);
        relatielayoutroot.addView(bt,rebt);
        relatielayoutroot.addView(bt1,reebt);

    }
    public void createLinearLayoutView(){
        linearlayoutroot=new LinearLayout(this);
        linearlayoutroot.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        linearlayoutroot.setOrientation(LinearLayout.VERTICAL);

        LinearLayout linearLayoutSub=new LinearLayout(this);
        linearLayoutSub.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayoutSub.setOrientation(LinearLayout.HORIZONTAL);

        ImageView mgv=new ImageView(this);
        mgv.setImageResource(R.mipmap.ic_launcher);

        TextView tv2=new TextView(this);
        tv2.setText("Toi la Dang Dinh Chi dan em cua Thanhcoder");
        LinearLayout.LayoutParams lay=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        lay.gravity= Gravity.CENTER;
        lay.setMargins(20,0,0,0);
        tv2.setLayoutParams(lay);

        linearLayoutSub.addView(mgv);
        linearLayoutSub.addView(tv2);

        Button bt=new Button(this);
        bt.setText("Click de xem");
        bt.setLayoutParams(lay);

        Button bt2=new Button(this);
        bt2.setLayoutParams(lay);
        bt2.setText("hihi do ngoc");


        linearlayoutroot.addView(linearLayoutSub);
        linearlayoutroot.addView(bt);
        linearlayoutroot.addView(bt2);





    }
}
