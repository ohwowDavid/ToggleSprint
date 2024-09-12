package Config;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;


public class ConfigGui extends GuiScreen {

    int lastClickedButton = 0;

    @Override
    public void initGui() {
        super.initGui();
        // add buttons here
        this.buttonList.add(new GuiButton(0, width / 2 - 55, height / 2 - 10, 30, 20, "Test"));
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        // do stuff when button is clicked
        lastClickedButton = button.id;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
