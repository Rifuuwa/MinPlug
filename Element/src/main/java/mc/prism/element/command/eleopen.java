package mc.prism.element.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class eleopen implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;

            //检测玩家是否有权限
            if (p.hasPermission("element.open")){
                p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"你打开了元素通道！");
                p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"你将会持续使用元素！");
            }else {
                p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"你没有使用它的权限！");
            }

        }
        else {
            System.out.println(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"该指令只能由玩家执行");
        }
        return true;
    }

}
