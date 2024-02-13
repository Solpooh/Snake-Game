import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    // 화면 배치, 필요한 변수 선언
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 30;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    static final int DELAY = 100;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    // 게임 시작 방법
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    // 그리드 형식의 그리기
    public void draw(Graphics g) {
            // 격자선 그리기 for 가시성
        for (int i = 0; i < SCREEN_HEIGHT/UNIT_SIZE; i++) {
            g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
        }

            // 사과의 크기
        g.setColor(Color.red);
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            // 뱀의 몸 그리기
                // 뱀의 머리 부분

                    // 뱀 랜덤색 적용


            // 화면에 Score 표시

    }
    // 사과 좌표 생성
    public void newApple() {
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }
    // 뱀 움직이기
    public void move() {

    }
    // 사과 잡기
    public void checkApple() {

    }

    // 충돌 설정
    public void checkCollisions() {
        // 머리가 몸체에 충돌하는지 확인

        // 머리가 왼쪽 경계에 닿는지 확인

        // 머리가 오른쪽 경계에 닿는지 확인

        // 머리가 위쪽 테두리에 닿는지 확인

        // 머리가 아래쪽 테두리에 닿는지 확인

    }
    public void gameOver(Graphics g) {
        // Game Over 텍스트 표시


        // 점수도 같이 표시

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // 게임이 실행중이면

    }

    // 방향키를 누를 때 발생하는 이벤트
    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {


        }
    }
}
