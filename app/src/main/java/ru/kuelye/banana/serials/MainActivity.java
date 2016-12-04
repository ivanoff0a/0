package ru.kuelye.banana.serials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Serial[] serials; // объявление массива с сериалами

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serials = new Serial[4]; // инициализация массива с сериалами
        serials[0] = new Serial("Шерлок");
        serials[1] = new Serial("Офис");
        serials[2] = new Serial("Ледокол");
        serials[3] = new Serial("Доктор \"Кто\"");

        // ищём в окне список
        ListView listView = (ListView) findViewById(R.id.list_view);
        // выбираем макет для элементов списка, сохраняем его id
        int itemLayout = android.R.layout.simple_list_item_1;
        // создаём адаптер - он перенесёт данные из serials в listView
        ArrayAdapter adapter = new ArrayAdapter<Serial>(this, itemLayout, serials);
        // устанавливаем адаптер
        listView.setAdapter(adapter);
    }
}
