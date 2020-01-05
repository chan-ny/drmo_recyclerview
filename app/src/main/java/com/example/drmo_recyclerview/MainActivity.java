package com.example.drmo_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    private ArrayList<String> mProvince = new ArrayList<>();
    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mDetail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initimage();
    }

    private void initimage(){
                mProvince.add("https://scontent.fbkk15-1.fna.fbcdn.net/v/t1.0-9/64998057_511794262894877_9020508044131303424_n.jpg?_nc_cat=111&_nc_oc=AQmkQzyWSl1KjlKmmh16Q6jBvnScFvBmuGxvrXVbVhBodHyNC7m1iDnUXzjIriOFSzM&_nc_ht=scontent.fbkk15-1.fna&oh=5082738f78407de85abeccc253382350&oe=5E942357");
        mName.add("ແຂວງຈຳປາສັກ");
        mDetail.add("ແຂວງຈຳປາສັກ ເປັນແຂວງໜື່ງທີ່ເປັນແຫ່ງທ່ອງທຽ່ວທີ່ມີຄວາມສ່ວຍງາມ ມີແຫ່ງທ່ອງທ່ຽວຫຼາຍກວ່າທຸກແຂວງສະເລ່ຍ" +
                " 60/100 ມີວັດທະນາທຳທີ່ເກົ່າແກ້,ມີສະຖານທີ່ເກົ່າແກ້ທີ່ເປັນມູນເຊື່ອຂອງຊາວລາວ\n" +
                "ແລະ ໄດ້ຮັບເຂົ້າເປັນມູນມໍລະດົກໂລກ ເຊັ່ນ:ວັນພູຈຳປາສັກ...");
//
        mProvince.add("https://scontent.fbkk15-1.fna.fbcdn.net/v/t1.0-9/29594755_128284524680292_7085698569788801556_n.jpg?_nc_cat=101&_nc_oc=AQkst9Oynuev2S_At3D_K0Ope65RYXsEWxRhAgaokOwWXiQHP-11OqHxFFnNlayXDII&_nc_ht=scontent.fbkk15-1.fna&oh=9a3e3d33af25fe7aadcd02e041289ae7&oe=5EB408C2");
        mName.add(" ແຂວງສາລະວັນ");
        mDetail.add("ແຂວງສາລະວັນ ເປັນແຂວງໜື່ງທີ່ເປັນແຫ່ງທ່ອງທຽ່ວທີ່ມີຄວາມສ່ວຍງາມ ມີແຫ່ງທ່ອງທ່ຽວຫຼາຍກວ່າທຸກແຂວງສະເລ່ຍ" +
                " 30/100 ມີວັດທະນາທຳທີ່ເກົ່າແກ້,ມີສະຖານທີ່ເກົ່າແກ້ທີ່ເປັນມູນເຊື່ອຂອງຊາວລາວ\n" +
                "ແລະ ,ມີນ້ຳຕົກຕາດທີ່ສ່ວຍງາມ ແລະ ສະຖານທີ່ທ່ອງທຽ່ວ");


        mProvince.add("https://scontent.fbkk15-1.fna.fbcdn.net/v/t1.0-9/76974188_110582387098136_4750807679956418560_n.jpg?_nc_cat=102&_nc_oc=AQlXcO-V-MosImed6Yfmzr1KHKrhVAnzBdr_aOC_DjQWQkwMCq8gajVTvSF9ak-FHkQ&_nc_ht=scontent.fbkk15-1.fna&oh=a1d5a053af3c7101eaa26d58d4744a51&oe=5EAA03B7");
        mName.add(" ແຂວງເຊກອງ");
        mDetail.add("ແຂວງເຊກອງເປັນແຂວງໜື່ງທີ່ມີຄວາມອຸດົມສົມບູນທາງດ້ານວັດທະນະທຳບັນດາເຜົ່າ ທາງປະຫວັດສາດ " +
                "ແລະ ທຳມະຊາດທີ່ສ່ວຍງາມ ແລະ ມີອາຫານການກິນທີ່ມີເອກະລັກຂອງເຜົ່າ ແລະ ຂອງຊາດ");
        mProvince.add("https://scontent.fbkk15-1.fna.fbcdn.net/v/t1.0-0/p640x640/78627557_166419838088509_2487040416642236416_o.jpg?_nc_cat=102&_nc_oc=AQk-Zkd_nbcb1MzkMmDLGijYEI_z6CKDSgvbhDfqiVZzdrGlwb86r2QLhV67ToEg6a0&_nc_ht=scontent.fbkk15-1.fna&oh=1df5011583bdd2d140f05ed30c57adee&oe=5E9F68E6");
        mName.add(" ແຂວງອັດຕະປື");
        mDetail.add("…ວັດທະນະທຳ ແລະ ທ່ອງທ່ຽວ ແຂວງອັດຕະປືໃຫ້ຮູ້ວ່າ: ຜ່ານການສຳຫຼວດຕົວຈິງ ບັນດາຊ່ຽວຊານຢັ້ງຢືນວ່າ ມີຄວາມເລິກ " +
                "75 ແມັດ, ທາງຂ້າງອ້ອມຮອບໜອງໄດ້ພົບຫິນເປັນລັກສະນະຫຼາຍຂັ້ນ " +
                "ແລະ ຢູ່ພື້ນນ້ຳໄດ້ພົບສະເກັດຫິນເປັນສີນ້ຳຕານ ຫຼື ສີເຜົາໄໝ້,… ທ່ຽວຊົມມະຫານ້ຳຕົກສຸດອະລັງການ ຂຸມຊັບທາງການທ່ອງທ່ຽວທີ່ເປັນຄວາມຝັນຂອງນັກລ່ານ້ຳຕົກ");

        mProvince.add("https://scontent.fbkk15-1.fna.fbcdn.net/v/t1.0-9/27332108_734810433395351_7205600222043153954_n.jpg?_nc_cat=101&_nc_oc=AQkoFglFf2Q2QOFtY2t4fpyDQDCX48r7zCTYB-KFsk_uxP1qyIuqPWj776q7NXoJOdQ&_nc_ht=scontent.fbkk15-1.fna&oh=fdb32af21e5fd168e6718c41b0d5bf89&oe=5E970BDF");
        mName.add(" ແຂວງສະຫວັນນະເຂດ");
        mDetail.add("ພາກພູມໃຈ \"ການຈຳລອງກະບອງໃຫຍ່ ແມ່ນໜຶ່ງກິດຈະກຳຂອງຊົນເຜົ່າບຣູ ເຂດບ້ານໂພນງາມ ເມືອງອາດສະພອນ ແຂວງສະຫວັນນະເຂດ, ມີຄວາມກວ້າງ 80 cm ຍາວ 05 m" +
                " ໄປວາງສະແດງໃນງານບຸນປະເພນີງານເທດສະການກອງເຂົ້າໃຫຍ່ ໄຫວ້ພະທາດອີງຮັງ ຕິດພັນກັບປີທ່ອງທ່ຽວລາວ…");

        mProvince.add("https://scontent.fbkk15-1.fna.fbcdn.net/v/t1.0-9/72844762_816387638778475_7485634934682419200_n.jpg?_nc_cat=100&_nc_oc=AQljfvPZwsxsGzFXTv9xOhxaWwJP0zR9j586hfDOYk_hZSrJj-caTH_pyrmRIpE3HXk&_nc_ht=scontent.fbkk15-1.fna&oh=a184d098a5aec4d8205b472a7499d981&oe=5EAD9DE8");
        mName.add(" ແຂວງຄຳມວນ");
        mDetail.add("ຮ່າງກາຍຕ້ອງການຄວາມສູງ! ກຽມເປີດ 'ພູຜາມ່ານ' ໃຫ້ນັກທ່ອງທ່ຽວໂຫນ-ປີນ-ໄຕ່ Skywalk ເໜືອປ່າຫິນ\"\n" +
                "ເບື້ອງຕົ້ນມີຂໍ້ມູນອອກມາວ່າ ກິດຈະກຳທ່ອງທ່ຽວໃໝ່ນີ້ຈະເປີດໃຫ້ບໍລິການໃນເດືອນກັນຍາ ແຕ່ເນື່ອງຈາກການກໍ່ສ້າງທີ່ຍັງບໍ່ທັນສຳເລັດຮຽບຮ້ອຍດີ ຈຶ່ງໄດ້ເລື່ອນກຳນົດການເປີດໃຫ້ບໍລິການໄປເປັນເດືອນທັນວາ 2019.\n" +
                "ທັງນີ້ ພູຜາມ່ານ ເປັນຈຸດຊົມວິທີ່ຂຶ້ນຊື່ຂອງທາງເລກທີ 8 ເຊິ່ງເຊື່ອມຕໍ່ທາງເລກທີ 13 ກັບຊາຍແດນຫວຽດນາມ. ບໍລິເວນອ້ອມຮອບມີແຫຼ່ງທ່ອງທ່ຽວຊື່ດັງຫຼາຍແຫ່ງເປັນຕົ້ນແມ່ນ: ຖໍ້າກອງລໍ, ວັງນໍ້າເຢັນ, ນໍ້າຕົກຕາດນໍ້າສະນາມ ແລະ ອື່ນໆ.");



        initRecyclerView();
    }
    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.tag_screen_reader);
        Adapter adapter = new Adapter(this, mName, mProvince,mDetail);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
