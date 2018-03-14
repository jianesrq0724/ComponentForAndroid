package com.ecaray.pda_xj;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.luojilab.component.componentlib.router.ui.UIRouter;
import com.luojilab.component.componentlib.service.AutowiredService;
import com.luojilab.router.facade.annotation.RouteNode;

/**
 * @author Carl
 * @version 1.0
 * @since 2018/3/11
 */
@RouteNode(path = "/main", desc = "首页")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AutowiredService.Factory.getInstance().create().autowire(this);

        setContentView(R.layout.activity_main);

        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIRouter.getInstance().openUri(MainActivity.this, "DDComp://login/loginIn", null);
            }
        });
    }

}
