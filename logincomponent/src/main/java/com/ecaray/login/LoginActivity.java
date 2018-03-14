package com.ecaray.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.luojilab.router.facade.annotation.RouteNode;

/**
 * @author Carl
 * @version 1.0
 * @since 2018/3/11
 */
@RouteNode(path = "/loginIn", desc = "登录页面")
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

}
