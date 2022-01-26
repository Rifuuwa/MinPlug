package mc.prism.element.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){  //新建方法 定义玩家加入事件 e
        Player p = e.getPlayer();
        //向玩家发送进入服务器消息
        p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"充满了你的身体！");
        //发送加入服务器消息
        e.setJoinMessage("");

    }


}
