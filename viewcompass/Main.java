package viewcompass;

import cn.nukkit.Player;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {

	private static final String[] compass = new String[36];

	public void onEnable() {
		compass[0] = "\u00A77|  |  |  |  |  \u00A7l\u00A71S\u00A7r\u00A77  |  |  |  |  |";
		compass[1] = "\u00A77|  |  |  |  \u00A7l\u00A71S\u00A7r\u00A77  |  |  |  |  |  |";
		compass[2] = "\u00A77|  |  |  \u00A7l\u00A71S\u00A7r\u00A77  |  |  |  |  \u00A7l\u00A7fSW\u00A7r\u00A77  |  |";
		compass[3] = "\u00A77|  |  |  |  |  |  \u00A7l\u00A7fSW\u00A7r\u00A77  |  |  |  |";
		compass[4] = "\u00A77|  |  |  |  |  \u00A7l\u00A7fSW\u00A7r\u00A77  |  |  |  |  |";
		compass[5] = "\u00A77|  |  |  |  \u00A7l\u00A7fSW\u00A7r\u00A77  |  |  |  |  |  |";
		compass[6] = "\u00A77|  |  \u00A7l\u00A7fSW\u00A7r\u00A77  |  |  |  |  \u00A7l\u00A7aW\u00A7r\u00A77  |  |  |";
		compass[7] = "\u00A77|  |  |  |  |  |  \u00A7l\u00A7aW\u00A7r\u00A77  |  |  |  |";
		compass[8] = "\u00A77|  |  |  |  |  \u00A7l\u00A7aW\u00A7r\u00A77  |  |  |  |  |";
		compass[9] = "\u00A77|  |  |  |  |  \u00A7l\u00A7aW\u00A7r\u00A77  |  |  |  |  |";
		compass[10] = "\u00A77|  |  |  |  \u00A7l\u00A7aW\u00A7r\u00A77  |  |  |  |  |  |";
		compass[11] = "\u00A77|  |  |  \u00A7l\u00A7aW\u00A7r\u00A77  |  |  |  |  \u00A7l\u00A7fNW\u00A7r\u00A77  |  |";
		compass[12] = "\u00A77|  |  |  |  |  |  \u00A7l\u00A7fNW\u00A7r\u00A77  |  |  |  |";
		compass[13] = "\u00A77|  |  |  |  |  \u00A7l\u00A7fNW\u00A7r\u00A77  |  |  |  |  |";
		compass[14] = "\u00A77|  |  |  |  \u00A7l\u00A7fNW\u00A7r\u00A77  |  |  |  |  |  |";
		compass[15] = "\u00A77|  |  \u00A7l\u00A7fNW\u00A7r\u00A77  |  |  |  |  \u00A7l\u00A7cN\u00A7r\u00A77  |  |  |";
		compass[16] = "\u00A77|  |  |  |  |  |  \u00A7l\u00A7cN\u00A7r\u00A77  |  |  |  |";
		compass[17] = "\u00A77|  |  |  |  |  \u00A7l\u00A7cN\u00A7r\u00A77  |  |  |  |  |";
		compass[18] = "\u00A77|  |  |  |  |  \u00A7l\u00A7cN\u00A7r\u00A77  |  |  |  |  |";
		compass[19] = "\u00A77|  |  |  |  \u00A7l\u00A7cN\u00A7r\u00A77  |  |  |  |  |  |";
		compass[20] = "\u00A77|  |  |  \u00A7l\u00A7cN\u00A7r\u00A77  |  |  |  |  \u00A7l\u00A7fNE\u00A7r\u00A77  |  |";
		compass[21] = "\u00A77|  |  |  |  |  |  \u00A7l\u00A7fNE\u00A7r\u00A77  |  |  |  |";
		compass[22] = "\u00A77|  |  |  |  |  \u00A7l\u00A7fNE\u00A7r\u00A77  |  |  |  |  |";
		compass[23] = "\u00A77|  |  |  |  \u00A7l\u00A7fNE\u00A7r\u00A77  |  |  |  |  |  |";
		compass[24] = "\u00A77|  |  \u00A7l\u00A7fNE\u00A7r\u00A77  |  |  |  |  \u00A7l\u00A7eE\u00A7r\u00A77  |  |  |";
		compass[25] = "\u00A77|  |  |  |  |  |  |  \u00A7l\u00A7eE\u00A7r\u00A77  |  |  |";
		compass[26] = "\u00A77|  |  |  |  |  |  \u00A7l\u00A7eE\u00A7r\u00A77  |  |  |  |";
		compass[27] = "\u00A77|  |  |  |  |  \u00A7l\u00A7eE\u00A7r\u00A77  |  |  |  |  |";
		compass[28] = "\u00A77|  |  |  |  \u00A7l\u00A7eE\u00A7r\u00A77  |  |  |  |  |  |";
		compass[29] = "\u00A77|  |  |  \u00A7l\u00A7eE\u00A7r\u00A77  |  |  |  |  \u00A7l\u00A7fSE\u00A7r\u00A77  |  |";
		compass[30] = "\u00A77|  |  |  |  |  |  \u00A7l\u00A7fSE\u00A7r\u00A77  |  |  |  |";
		compass[31] = "\u00A77|  |  |  |  |  \u00A7l\u00A7fSE\u00A7r\u00A77  |  |  |  |  |";
		compass[32] = "\u00A77|  |  |  |  \u00A7l\u00A7fSE\u00A7r\u00A77  |  |  |  |  |  |";
		compass[33] = "\u00A77|  |  \u00A7l\u00A7fSE\u00A7r\u00A77  |  |  |  |  \u00A7l\u00A71S\u00A7r\u00A77  |  |  |";
		compass[34] = "\u00A77|  |  |  |  |  |  |  \u00A7l\u00A71S\u00A7r\u00A77  |  |  |";
		compass[35] = "\u00A77|  |  |  |  |  |  \u00A7l\u00A71S\u00A7r\u00A77  |  |  |  |";

		getServer().getScheduler().scheduleDelayedRepeatingTask(this, new Task(this), 1, 1);
	}

	public String getCompass(double direction) {
		direction = direction + Math.ceil(-direction / 360) * 360;
		direction = direction * 2 / 10 / 2;
		return compass[Math.round((long) direction)];
	}
}

class Task extends Thread {

	private Main plugin;

	public Task(Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public void run() {
		for (Player player : plugin.getServer().getOnlinePlayers().values()) {
			player.sendPopup(plugin.getCompass(player.getYaw()));
		}
	}
}
