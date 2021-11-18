package com.example.skincare.datas;

import java.util.ArrayList;

public class Input_Forehead {

    ArrayList<Forehead> items = new ArrayList<>();

    public ArrayList<Forehead> getItems() {

        Forehead data1 = new Forehead(
                "android.resource://com.example.skincare/drawable/forehead_pustular",
                "농포성 여드름",
                "가장 흔한 여드름의 형태로 " +
                        "면포나 구진, 농포가 서로 혼합되어 나타나는 형태이다. " +
                        "여드름에 염증반응이 심해지면서 발생하게 된다. " +
                        "여드름균과 백혈구가 싸우면서 생긴 죽은 세포들과 피지가 " +
                        "표면으로 올라오면서 노란색 농포가 생기는 것이다. " +
                        "고름이 발생한 상태로 노랗게 곪는 염증이 발생하면서 만지면 통증이 있을 수 있고 " +
                        "조직이 약해져 있기 때문에, \n" +
                        "적은 자극에도 피부층이 손상을 받기 쉬운 상태이다. " +
                        "즉, 피지선의 외막이 터진것으로 좀 더 심한 상태이고 " +
                        "흉터나 자국을 남기기 쉬우므로 관리에 더욱 유의해야 한다.\n",
                "여드름 농이 찬다면 여드름 바늘이나 린셋, 니들로 찌르고 " +
                        "올바르게 짜준 다음, 패치를 붙이고 여드름 연고를 사용한 후, " +
                        "피부진정클렌저를 사용하여 재생라인 화장품으로 관리해준다. " +
                        "물을 자주 마셔주고, 수분공급을 신경써줘서 피부가 건조하지 않게 해준다. " +
                        "수면을 충분히 취해주며, 여드름 전용라인을 꾸준하게 사용해준다.\n");

        Forehead data2 = new Forehead(
                "android.resource://com.example.skincare/drawable/forehead_comedonal",
                "면포성 여드름",
                "면포성 여드름(좁쌀 여드름)은 이제 막 생기는 여드름으로 오돌토돌하게 솟은 것 같은 여드름을 말한다. " +
                        "각질이 제대로 관리가 되지 않으면서 각질이 모공을 막아 피지가 밖으로 배출되지 못해 " +
                        "모공에 피지가 모이면서 생기는것이다. " +
                        "이런 좁쌀여드름은 초기에 제대로 관리해주지 않으면 " +
                        "여기저기 번지면서 피부에 수십개가 생기고," +
                        "붉은 염증성여드름으로 발전할 수 있기 때문에 관리를 잘 해주는것이 좋다.",
                "BHA 각질제거제로 모공을 막는 각질을 관리해주고, " +
                        "모공관리가 가능한 클렌저로 모공 속에 쌓인 피지를 관리해주고, " +
                        "그 중에서도 바오밥나무추출물, 병풀추출물 같은 여드름 완화 성분이 들어간 " +
                        "여드름 세안제를 사용한다.\n");

        Forehead data3 = new Forehead(
                "android.resource://com.example.skincare/drawable/forehead_seborrheic",
                "지루성 여드름",
                "지루성 피부염을 동반한 여드름이다. " +
                "화농성 여드름이나 좁쌀 여드름처럼 병변이 확실치 않고, " +
                "피부가 번들거리면서 진물을 동반한 경우가 많다. " +
                "단순한 여드름이 아니기 때문에 치료시간과 노력이 가장 많이 필요한 여드름이다.\n",
                "피부가 약해져 있기 때문에 팩이나 스크럽등은 피한다. " +
                        "각질 제거, 필링 또한 삼가해야하며, 피지만 가볍게 조절한다. " +
                        "유분이 많은 화장품을 피하며, 가볍게 수분크림만 발라준다. " +
                        "한약치료를 권장한다.\n");

        items.add(data1);
        items.add(data2);
        items.add(data3);

        return items;
    }
}
