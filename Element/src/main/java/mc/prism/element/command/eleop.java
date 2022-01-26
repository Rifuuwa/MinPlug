package mc.prism.element.command;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class eleop implements CommandExecutor {
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;


            if (p.hasPermission("element.op")){

                p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"所有权限已打开");

            }
            else {
                p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"你没有使用它的权限！");
            }

            //检测是否有参数
            if (args.length < 1){
                p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"你必须添加至少一个参数");
                        return true;
            }


            return true;
        }
        else {
            System.out.println("该指令只能由玩家执行");
        }

        return false;
    }
}


