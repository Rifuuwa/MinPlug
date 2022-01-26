package mc.prism.element.command;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class elemenu implements CommandExecutor {
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

            //元素菜单权限

            if (p.hasPermission("element.menu")){
                p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"你打开了元素菜单");
            }
            else{
                p.sendMessage(ChatColor.GOLD+"[元素]"+ChatColor.WHITE+"你没有使用它的权限！");
            }



            //下面的我没想好
            //想法：有权限时并执行子参数发送消息（也许还会调用Listener看看会不会使用到元素）-> PlayerHand
            /*if (){

            }
            else {
                p.sendMessage("用法 /element <args>");
                //return false
                return true;
            }

             */
            return true;
        }
        else {
            System.out.println("该指令只能由玩家执行");
        }

        return false;
    }
}
