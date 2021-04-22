package com.example.myapplication;

import android.widget.Button;

import java.util.ArrayList;

public class HeroDataSource {
    private static String[] heroNames = {
            "Fushiguro Megumi",
            "Geto Suguru",
            "Gojo Satoru",
            "Inumaki Toge",
            "Itadori Yuuji",
            "Kasumi Miwa",
            "Kugisaki Nobara",
            "Mechamaru",
            "Nanami Kent",
            "Panda"
    };


    private static String[] heroDetails = {
            "Fushiguro Megumi:\n" +
                    "Megumi is a tall, dark-haired boy with light green eyes\n" +
                    "and spiky dark blue hair\n" +
                    "He wears the standard Jujutsu Tech uniform which consists of a long-sleeved over-shirt with a high collar\n" +
                    "matching trousers and ankle high boots\n" +
                    "Chimera Shadow Garden (嵌合暗翳庭 Kangō An'eitei?): The area is flooded with a large amount of fluid shadow.",
            "Suguru Geto:\n" +
                    "Suguru Geto is an antagonist in both the Jujutsu Kaisen\n" +
                    "His earlobes are large enough to fit fairly large circular earrings\n" +
                    "In 2006, Suguru's hair was much shorter as a student. Most of it tied up but his bangs were still as prominent\n" +
                    "After August 2007 when Suguru became a curse user, his hair began to grow longer and reflect the length it is in 2017.",
            "Gojo Satoru\n" +
                    "Satoru Gojo is a tall man\n" +
                    "towering over his students\n" +
                    "and is considered to be very attractive by many people\n" +
                    "Gojo lets it down when he's in more casual attire\n" +
                    "Gojo has bright blue eyes,\n" +
                    "but they're usually covered by his signature black blindfold or a pair of dark sunglasses",
            "Inumaki Toge:\n" +
                    "Toge is a slim young man with light skin, brown eyes, and mid-length straight hair\n" +
                    "He was born with the 'Snake and Fangs' seal of the Inumaki family on his tongue and both cheeks\n" +
                    "so his jujutsu student uniform with a high collar tailored into it that covers his mouth. While training\n" +
                    "Toge wears a zipped-up dark collar underneath a white short sleeve shirt with athletic pants and shoes",
            "Itadori Yuuji:\n" +
                    "Yuji Itadori is the main protagonist of the Jujutsu Kaisen series\n" +
                    "He is the son of Jin Itadori and grandson of Wasuke Itadori, who was living a normal life until he encountered Megumi and one of Sukuna's fingers\n" +
                    "After becoming Sukuna's vessel, Yuji began attending Tokyo Jujutsu High alongside Megumi and Nobara as first-year students\n" +
                    "Great Cursed Energy: Yuji's cursed energy originates from the parts of the special grade curse, Ryomen Sukuna\n" +
                    "He doesn't seem to have an innate talent, but he has shown great proficiency with learning how to control cursed energy",
            "Kasumi Miwa:\n" +
                    "Kasumi wears black long sleeved jacket over a light colored button down shirt and a black tie\n" +
                    "black pants, black socks, black shoes, and a belt that she uses to hold her sword\n" +
                    "While training, Kasumi has her hair tied in a ponytail and wears a dark colored track suit.\n" +
                    "Kasumi comes from a poor family and has two younger brothers\n" +
                    "She was the captain of the youth basketball team",
            "Kugisaki Nobara:\n" +
                    "Nobara is a short girl with orange eyes and orange hair \n" +
                    "Nobara Kugisaki is a Grade 3 sorcerer\n" +
                    "But she has showcased above-average skill when it comes to being a jujutsu sorcerer\n" +
                    "Straw Doll Technique Nobara's Innate technique allows her to use a straw doll to attack the opponent from distance",
            "Mechamaru:\n" +
                    "Kokichi was a reclusive and reserved individual who resented being born without a future outside of the jujutsu world\n" +
                    "He proudly admitted he'd give back every ounce of cursed energy to gain a normal body\n" +
                    "Around his classmates, Kokichi embraced the quiet robotic type persona while acting as a student through Mechamaru\n" +
                    "He wanted to walk amongst them one day in spite of his condition and however they might have treated him",
            "Nanami Kent:\n" +
                    "Kento Nanami is a supporting character in Jujutsu Kaisen\n" +
                    "He was a former student of Tokyo Jujutsu High where he was an underclassman of Satoru Gojo and Suguru Geto\n" +
                    "Nanami is a very wise and reserved kind of man, often appearing so calm and indifferent that he comes off as stoic and aloof\n" +
                    "Great Cursed Energy: Nanami has remarkable levels of cursed energy for a jujutsu sorcerer",
            "Panda:\n" +
                    "Not an actual panda, he is an Abrupt Mutated Cursed Corpse created by principal Masamichi Yaga and attends Jujutsu High as a second-year student\n" +
                    "Overall Skill Level: Panda is a grade 2 sorcerer and an Abrupt Mutated cursed corpse\n" +
                    "Great Cursed Energy: As a cursed corpse, Panda naturally possess a high degree of cursed energy\n" +
                    "There exists three cores within Panda's body: the balanced-type Panda, the power-type Gorilla"
    };



    private static int[] heroesImages = {
            R.drawable.fushiguro,
            R.drawable.geto,
            R.drawable.gojo,
            R.drawable.inumaki,
            R.drawable.itadori,
            R.drawable.kasuimi,
            R.drawable.kugisaki,
            R.drawable.mechamaru,
            R.drawable.nanami,
            R.drawable.panda
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }

    static Hero getDataIndex(int position) {
        Hero hero = new Hero();
        hero.setName(heroNames[position]);
        hero.setDetail(heroDetails[position]);
        hero.setPhoto(heroesImages[position]);
        return hero;
    }
}









