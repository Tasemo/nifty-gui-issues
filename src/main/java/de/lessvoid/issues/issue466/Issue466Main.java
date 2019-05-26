package de.lessvoid.issues.issue466;

import com.jogamp.newt.opengl.GLWindow;
import de.lessvoid.issues.JOGLNiftyRunner;
import de.lessvoid.issues.JOGLNiftyRunner.Callback;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.AbstractController;
import de.lessvoid.nifty.controls.Parameters;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.input.NiftyInputEvent;
import de.lessvoid.nifty.screen.Screen;

import javax.annotation.Nonnull;

public class Issue466Main extends AbstractController {

    private Element element;

    @Override
    public void bind(@Nonnull Nifty nifty, @Nonnull Screen screen, @Nonnull Element element, @Nonnull Parameters parameters) {
        this.element = element;
    }

    @Override
    public void onStartScreen() {}

    @Override
    public boolean inputEvent(@Nonnull NiftyInputEvent niftyInputEvent) {
        return false;
    }

    public void onHoverStart() {
        System.out.println("onHoverStart for " + element);
    }

    public void onHoverEnd() {
        System.out.println("onHoverEnd for " + element);
    }

    public void onClickStart() {
        System.out.println("onClickStart for " + element);
    }

    public void onClickEnd() {
        System.out.println("onClickEnd for " + element);
    }

    public static void main(String[] args) throws Exception {
        JOGLNiftyRunner.run(args, new Callback() {
            @Override
            public void init(final Nifty nifty, final GLWindow glWindow) {
                nifty.fromXml("src/main/resources/de/lessvoid/issues/issue466/issue466.xml", "start");
            }
        });
    }
}
