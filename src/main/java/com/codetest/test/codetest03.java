package com.codetest.test;

/**
 * Created by nickzhang on 2017/4/5.
 */
public class codetest03 {

    public static void main(String[] args) {

        System.out.println("c:cloudcontrol:".length());

        System.out.println("c:cloudcontrol:t_noticeBar&l_zh&t_display&l_zh&t_popupWindow&l_zh&t_wording&l_zh&t_setting&l_zh&t_rubbish&l_zh&t_lockscreen&l_zh&t_autoacceleration&l_zh&".replace("&","%26"));

        System.out.println("c:cloudcontrol:".replace("&","%26"));
    }
}
