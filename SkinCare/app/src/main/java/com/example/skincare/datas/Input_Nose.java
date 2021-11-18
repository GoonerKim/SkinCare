package com.example.skincare.datas;

import java.util.ArrayList;

public class Input_Nose {

    ArrayList<Nose> items = new ArrayList<>();

    public ArrayList<Nose> getItems() {

        Nose data1 = new Nose(
                "android.resource://com.example.skincare/drawable/nose_normal",
                "일반적 코 여드름",
                "소화기능이 건강하지 않다면 코여드름이 발생하기 쉽다. " +
                        "회식과 같이 평소에 비해 자극적인 음식을 많이 먹게 되는 경우에 " +
                        "소화기능에 무리를 주어 코여드름이 쉽게 생기게 된다.\n",
                "자극적인 음식을 피하고, 터치를 삼가해야한다. " +
                        "코팩은 일시적인 여드름제거효과일 뿐, 블랙헤드를 생성할 수 있고, " +
                        "모공을 넓힐 수 있기 때문에 자주 사용하지 않는다. " +
                        "세수를 자주 하여 청결을 유지하고, " +
                        "유분이 많은 화장품은 피하며, 코에서 발생하는 기름을 자주 제거해준다.\n");

        Nose data2 = new Nose(
                "android.resource://com.example.skincare/drawable/nose_comedonal",
                "개방 면포성 여드름",
                "표면 끝이 열려있다는 뜻으로 흔히들 블랙헤드라고 부르는 여드름이다." +
                        "피지분비가 많은 T존(미간과 코)위주로 많이 발생하고, " +
                        "피지분비가 더욱 늘어나게 되면서 볼 부위까지 번지게 되고, " +
                        "관리하지 않으면 모공이 확장되기 쉽다.\n",
                "자극없이 모공을 열어주고 피지를 녹여주고 불려줄 수 있는 피지 연화제 제품을 사용한다. " +
                        "그리고 모공 닫아주는 모공팩으로 관리해주고 " +
                        "제거된 모공에 수분을 꽉 채워줄 수 있는 수분마스크팩과 기초라인으로 마무리한다. " +
                        "피지와 각질을 일주일에 한번씩 청소해준다.\n");

        items.add(data1);
        items.add(data2);

        return items;
    }
}
