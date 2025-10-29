package gk1.nguyenthanhtai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import gk1.nguyenthanhtai.R;

public class QuizSucKhoeActivity extends AppCompatActivity {

    TextView tvQuestionCount, tvQuestion, tvFinalScore;
    RadioGroup radioGroupOptions;
    RadioButton rbOption1, rbOption2, rbOption3, rbOption4;
    Button btnNextQuestion;

    List<Question> questionList;
    int currentQuestionIndex = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_suc_khoe);


        tvQuestionCount = findViewById(R.id.tvQuestionCount);
        tvQuestion = findViewById(R.id.tvQuestion);
        tvFinalScore = findViewById(R.id.tvFinalScore);
        radioGroupOptions = findViewById(R.id.radioGroupOptions);
        rbOption1 = findViewById(R.id.rbOption1);
        rbOption2 = findViewById(R.id.rbOption2);
        rbOption3 = findViewById(R.id.rbOption3);
        rbOption4 = findViewById(R.id.rbOption4);
        btnNextQuestion = findViewById(R.id.btnNextQuestion);

        questionList = new ArrayList<>();


        setupQuestions();


        loadNextQuestion();

        btnNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
                currentQuestionIndex++;
                loadNextQuestion();
            }
        });
    }


    private void setupQuestions() {
        questionList.add(new Question(
                "Bạn nên uống bao nhiêu lít nước mỗi ngày?",
                Arrays.asList("1 lít", "2 lít", "3 lít", "Càng nhiều càng tốt"),
                1
        ));
        questionList.add(new Question(
                "Vitamin C có nhiều nhất trong loại quả nào sau đây?",
                Arrays.asList("Ổi", "Cam", "Chuối", "Táo"),
                0
        ));
        questionList.add(new Question(
                "Một người trưởng thành nên ngủ bao nhiêu tiếng mỗi đêm?",
                Arrays.asList("4-5 tiếng", "5-6 tiếng", "7-8 tiếng", "9-10 tiếng"),
                2
        ));
        questionList.add(new Question(
                "Bệnh tiểu đường liên quan đến loại hormone nào?",
                Arrays.asList("Insulin", "Thyroxine", "Adrenaline", "Estrogen"),
                0
        ));
        questionList.add(new Question(
                "Tập thể dục bao nhiêu phút mỗi ngày được khuyến nghị?",
                Arrays.asList("10 phút", "30 phút", "60 phút", "90 phút"),
                1
        ));
    }


    private void checkAnswer() {
        int selectedRadioButtonId = radioGroupOptions.getCheckedRadioButtonId();

        if (selectedRadioButtonId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
            int selectedAnswerIndex = radioGroupOptions.indexOfChild(selectedRadioButton);

            if (selectedAnswerIndex == questionList.get(currentQuestionIndex).getDapAnDung()) {
                score++;
            }
        } else {
        }
    }


    private void loadNextQuestion() {
        if (currentQuestionIndex < questionList.size()) {
            radioGroupOptions.clearCheck();

            Question currentQuestion = questionList.get(currentQuestionIndex);

            tvQuestionCount.setText("Câu " + (currentQuestionIndex + 1) + "/" + questionList.size());
            tvQuestion.setText(currentQuestion.getCauHoi());
            rbOption1.setText(currentQuestion.getCacLuaChon().get(0));
            rbOption2.setText(currentQuestion.getCacLuaChon().get(1));
            rbOption3.setText(currentQuestion.getCacLuaChon().get(2));
            rbOption4.setText(currentQuestion.getCacLuaChon().get(3));

            if (currentQuestionIndex == questionList.size() - 1) {
                btnNextQuestion.setText("Hoàn thành");
            }

        } else {

            showFinalScore();
        }
    }


    private void showFinalScore() {

        tvQuestionCount.setVisibility(View.GONE);
        tvQuestion.setVisibility(View.GONE);
        radioGroupOptions.setVisibility(View.GONE);
        btnNextQuestion.setVisibility(View.GONE);

        tvFinalScore.setText("Kết quả:\nBạn đã trả lời đúng " + score + "/" + questionList.size() + " câu!");
        tvFinalScore.setVisibility(View.VISIBLE);
    }
}