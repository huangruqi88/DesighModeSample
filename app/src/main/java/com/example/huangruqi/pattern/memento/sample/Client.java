package com.example.huangruqi.pattern.memento.sample;

/**
 * @data: 2019/2/27 16:41
 * @author: 黄汝琪
 * @Email:
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //构建游戏对象
        CallOfDuty game = new CallOfDuty();
        //1.打游戏
        game.paly();

        Caretaker caretaker = new Caretaker();
        //2.游戏存档
        caretaker.archive(game.createMwmoto());
        //3.退出游戏
        game.quit();
        //4.恢复游戏
        CallOfDuty newGame = new CallOfDuty();
        newGame.reastore(caretaker.getMemoto());

    }
}
