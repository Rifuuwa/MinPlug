package mc.prism.element.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class eleclose implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            if (p.hasPermission("element.close")){
                p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"你关闭了元素通道");
                p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"你不再会持续使用元素！");
            }else {
                p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"你没有使用它的权限！");
            }
        }
        else {
            System.out.println("该指令只能由玩家执行");
        }
        return true;
    }
}
