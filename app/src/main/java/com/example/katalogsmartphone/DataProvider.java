package com.example.katalogsmartphone;


import android.content.Context;


import com.example.katalogsmartphone.model.Hp;
import com.example.katalogsmartphone.model.Oppo;
import com.example.katalogsmartphone.model.Samsung;
import com.example.katalogsmartphone.model.Xiomi;

import java.util.ArrayList;
import java.util.List;




public class DataProvider {
    private static List<Hp> hps = new ArrayList<>();

    private static List<Oppo> initDataOppo(Context ctx) {
        List<Oppo> oppos = new ArrayList<>();
        oppos.add(new Oppo("oppo a1k", "Android 9.0 (Pie), ColorOS 6",
                "Released 2020, April 09,MEMORY 32GB 2GB RAM, 32GB 3GB RAM, 64GB 3GB RAM, 64GB 4GB RAM", R.drawable.oppo_a1k));
        oppos.add(new Oppo("oppo a5s", "OS  Android 10, XOS 6.0",
                ": 2020, September 17. Released 2020, October 17,MEMORY 64GB 3GB RAM, 64GB 4GB RAM, 128GB 4GB RAM, 128GB 6GB RAM", R.drawable.oppo_a5s));
        oppos.add(new Oppo("oppo a53", "OS Android 9.0 (Pie), XOS 5.0",
                ". Released 2019, September MEMORY : 32GB 2GB RAM, 64GB 4GB RAM", R.drawable.oppo_a53));
        oppos.add(new Oppo("oppo a71", "        infinixes.add(new Infinix(\"S5 PRO\", \"\",\n",
                "Released 2020, April MEMORY 64GB 4GB RAM, 128GB 6GB RAM", R.drawable.oppo_a71));
        oppos.add(new Oppo("oppo reno4", " OS Android 10",
                "Released 2020, August 31 MEMORY : 128GB 8GB RAM", R.drawable.oppo_reno4));
        return oppos;
    }
    private static List<Xiomi> initDataXiomi(Context ctx) {
        List<Xiomi> xiomis = new ArrayList<>();
        xiomis.add(new Xiomi("xiomi not 5a", "OS Android 11",
                "Released 2020, October 15 PLATFORM MEMORY 128GB 8GB RAM\n", R.drawable.xiomi_not_5a));
        xiomis.add(new Xiomi("xiomi not3", "OS Android 9.0 ",
                "Released 2018, October 18 MEMORY 64GB 4GB RAM, 128GB 4GB RAM\n", R.drawable.xiomi_not3));
        xiomis.add(new Xiomi("xiomi not 9pro", "JOS Android 10, upgradable to Android 11",
                "Released 2019, October 22 MEMORY 64GB 6GB RAM, 128GB 6GB RAM ", R.drawable.xiomi_note_9pro));
        xiomis.add(new Xiomi("xiomi not8", "OS Android 11",
                ": Released 2020, October 15 MEMORY : 128GB 8GB RAM", R.drawable.xiomi_note8));
        xiomis.add(new Xiomi("xiomi not7", "Android 6.0.1 (Marshmallow), upgradable to Android 8.0 (Oreo)",
                "Released 2015, December 08 MEMORY 32GB 3GB RAM, 64GB 3GB RAM\n", R.drawable.xiomi_note7));
        return xiomis;

    }
    private static List<Samsung> initDataSamsung(Context ctx) {
        List<Samsung> samsungs = new ArrayList<>();
        samsungs.add(new Samsung("samsung a11", ":OS Android 6.0.1 (Marshmallow), upgradable to Android 8.0",
                ". Released 2016, September 08 MEMORY : 32GB 3GB RAM", R.drawable.samsung_a11));
        samsungs.add(new Samsung("samsung a50", "OS Android 8.0 (Oreo), upgradable to Android 9.0",
                ". Released 2017, September 19 MEMORY : 64GB 4GB RAM ", R.drawable.samsung_a50));
        samsungs.add(new Samsung("samsung a71", "OS Android 8.0 (Oreo), upgradable to Android 10",
                "Released 2018, April 20 MEMORY  64GB 4GB RAM, 64GB 6GB RAM ", R.drawable.samsung_a71));
        samsungs.add(new Samsung("samsung a51", "OS Android 5.1.1 (Lollipop), upgradable to 7.1.1 (Nougat)",
                "Released 2015, October 02 MEMORY :  32GB 3GB RAM", R.drawable.samsung_a51));
        samsungs.add(new Samsung("samsung s20", "OS Android 7.1 (Nougat), upgradable to Android 8.0 (Oreo)",
                "Released 2017, April 03 MEMORY : 32GB 4GB RAM, 64GB 4GB RAM", R.drawable.samsung_s20));
        return samsungs;
    }

    private static void initAllHps(Context ctx) {
        hps.addAll(initDataOppo(ctx));
        hps.addAll(initDataXiomi(ctx));
        hps.addAll(initDataSamsung(ctx));

    }

    public static List<Hp> getAllHp(Context ctx) {
        if (hps.size() == 0) {
            initAllHps(ctx);
        }
        return  hps;
    }

    public static List<Hp> getHpsByTipe(Context ctx, String merek) {
        List<Hp> hpsByType = new ArrayList<>();
        if (hpsByType.size() == 0) {
            initAllHps(ctx);
        }
        for (Hp o : hps) {
            if (o.getMerek().equals(merek)) {
                hpsByType.add(o);
            }
        }
        return hpsByType;
    }

}







