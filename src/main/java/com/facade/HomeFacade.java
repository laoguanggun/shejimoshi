package com.facade;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName HomeFacade
 * @Description TODO
 * @createTime 2021年07月30日 10:09:00
 */
public class HomeFacade {

    private Popcorn popcorn = Popcorn.getInstance();
    private Music music = Music.getInstance();
    private Mov mov = Mov.getInstance();

    /**
     * 家庭影院启动
     */
    public void star() {
        popcorn.on();
        popcorn.poping();
        music.on();
        mov.on();
    }


    public void stop() {
        music.stop();
        music.stop();
    }

    public void off() {
        popcorn.off();
        music.off();
        mov.off();
    }
}
