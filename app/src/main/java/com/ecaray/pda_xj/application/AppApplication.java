package com.ecaray.pda_xj.application;


import android.app.Application;

import com.luojilab.component.componentlib.router.Router;
import com.luojilab.component.componentlib.router.ui.UIRouter;

/**
 * @author Carl
 * @version 1.0
 * @since 2018/3/11
 */

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        UIRouter.getInstance().registerUI("app");

//        Router.registerComponent("com.ecaray.login.applike.loginApplike");
    }
}
