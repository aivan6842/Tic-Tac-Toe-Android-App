package com.example.tictactoe;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EndGamePopUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game_pop_up);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width*.8), (int)(height*0.5));

        addWinnerText();
    }

    private void addWinnerText(){
        TicTacToeGame game = (TicTacToeGame)getIntent().getSerializableExtra("TicTacToe");
        int  textViewId = getResources().getIdentifier("textViewWinner" , "id", getPackageName());
        TextView curr = (TextView) findViewById(textViewId);
        curr.setText(game.getGameState().toString());
}
}
