package com.rizkytm.kamenrider.model;

import com.rizkytm.kamenrider.R;

import java.util.ArrayList;

public class RidersData {
    private static String[] riderNames = {
            "Kamen Rider Kuuga",
            "Kamen Rider Agito",
            "Kamen Rider Ryuki",
            "Kamen Rider Faiz",
            "Kamen Rider Blade",
            "Kamen Rider Hibiki",
            "Kamen Rider Kabuto",
            "Kamen Rider Den-O",
            "Kamen Rider Kiva",
            "Kamen Rider Decade"
    };

    private static String[] riderDetails = {
            "Kamen Rider Kuuga adalah Kamen Rider utama pertama di era Heisei, dan satu-satunya Rider di Kamen Rider Kuuga. Kekuatannya diciptakan oleh suku Linto kuno menggunakan artefak yang disebut Amadam, bersama dengan Gouram, untuk memerangi suku Gurongi mengerikan yang menyiksa mereka. Dia berubah menggunakan Arcle dan mengendarai TryChaser 2000 dan BeatChaser 2000.",
            "Kamen Rider Agito adalah Kamen Rider yang berkisah tentang seorang tokoh bernama Shouichi Tsugami. Dia adalah contoh dari Agito yang khas, sebuah evolusi manusia yang dibawa oleh kepemilikan kekuatan Agito. Dia bertransformasi menggunakan Alter Ring dan mengendarai Machine Tornador.",
            "Kamen Rider Ryuki mengambil tema Kartu. Terdapat banyak Kamen Rider pada serial ini. Setiap Kamen Rider saling bertarung satu sama lain demi mewujudkan impiannya. Mereka saling bertarung di dunia cermin",
            "Kamen Rider Faiz merupakan Rider utama di serial Kamen Rider Faiz. Syarat menjadi Faiz adalah Orphochs atau seseorang yang memiliki DNA Orphochs. Kamen Rider Faiz ialah Kamen Rider yang diciptakan oleh Smart Brain, beberapa pernah menjadi Faiz, namun Takumi Inui ialah Main Rider untuk Faiz Gear.",
            "Kamen Rider Blade mempunyai tema kumbang dan menggunakan kartu untuk meningkatkan kekuatannya. Kazuma Kenzaki adalah sosok Kamen Rider Blade yang ditunjuk oleh BOARD untuk menggunakan Rider System-02. Dia adalah orang kedua yang menjadi Kamen Rider setelah Sakuya Tachibana (Kamen Rider Garren). Kazuma dipilih karena kecerdasannya dan naluri bertahan hidup yang luar biasa.",
            "Kamen Rider Hibiki adalah Rider yang mengambil tema Oni (Setan Jepang) dan musik. Berbagai senjata yang digunakan dalam serial ini berupa alat musik seperti pemukul bedug, gitar dan terompet.",
            "Kamen Rider Kabuto menjadi sosok terkuat dalam serial ini. Para Rider dalam serial ini memiliki motif serangga, salah satunya Kumbang. Tendou Souji merupakan tokoh yang terpilih untuk menggunakan Rider System ciptaan ZECT. Rider System tersebut digunakan untuk mengalahkan musuh yang disebut Worm.",
            "Kamen Rider Den-O adalah serial yang penuh dengan komedi. Selain itu, serial ini mengambil tema tentang jelajah waktu. Nogami Ryoutaro adalah tokoh yang dapat berubah menjadi Kamen Rider Den-O. Ryoutaro bertarung dibantu oleh beberapa Imajin (setan) yang merasuki tubuh Ryoutaro.",
            "Kamen Rider Kiva memiliki motif vampire dan kelelawar. Untuk menjadi Kiva haruslah keturunan Fangire. Wataru sendiri memiliki keturunan Fangire, dia adalah anak hasil perkawinan Ratu Fangire dengan manusia.",
            "Kamen Rider Decade adalah Kamen Rider kesepuluh pada era Heisei. Decade memiliki kekuatan dapat berubah menjadi Kamen Rider lain. Selain itu, dalam ceritanya Decade mengunjungi dunia-dunia Kamen Rider terdahulu.",
    };

    private static int[] ridersImages = {
            R.drawable.kuuga,
            R.drawable.agito,
            R.drawable.ryuki,
            R.drawable.faiz,
            R.drawable.blade,
            R.drawable.hibiki,
            R.drawable.kabuto,
            R.drawable.den_o,
            R.drawable.kiva,
            R.drawable.decade,
    };

    public static ArrayList<Rider> getListData() {
        ArrayList<Rider> list = new ArrayList<>();
        for (int i = 0; i < riderNames.length; i++) {
            Rider rider = new Rider();
            rider.setName(riderNames[i]);
            rider.setDetail(riderDetails[i]);
            rider.setPhoto(ridersImages[i]);
            list.add(rider);
        }
        return list;
    }
}
