package myapp.com.mjj.textviewwithstring;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * TextView之开发常用总结
 * <p>
 * 说明：java代码中的硬编码是为了测试,正确的做法应该是写在strings.xml中,再引用.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
        initListener();
    }

    private void initView() {
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(getString(R.string.xliff_1, "code小生","Android特遣队"));
        tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setTypeface(Typeface.createFromAsset(getAssets(),"simkai.ttf"));
    }

    private void initListener() {
        tv1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.tv1:

                break;

        }
    }
}
