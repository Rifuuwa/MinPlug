package mc.prism.element;


import mc.prism.element.command.eleclose;
import mc.prism.element.command.elemenu;
import mc.prism.element.command.eleop;
import mc.prism.element.command.eleopen;
import mc.prism.element.listeners.PlayerJoin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;


public final class main extends JavaPlugin implements Listener {    //这里Main没有使用我不知道怎么办ee

    @Override
    public void onEnable() {
        // Plugin startup logic
        //启动信息

        getLogger().info(ChatColor.GOLD+"元素(Element) 已启动");
        /*
        另一种方法
        getLogger().info(Chatcolor.Green+"Element 已成功启动");
         */
        getServer().getPluginManager().registerEvents(new PlayerHand(),this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(),this);


        //注册命令
        getCommand("eleop").setExecutor(new eleop());
        getCommand("elemenu").setExecutor(new elemenu());
        getCommand("eleopen").setExecutor(new eleopen());
        getCommand("eleclose").setExecutor(new eleclose());
        //getCommand("elecreate").setExecutor(new elecreate());
        //getCommand("eleremove").setExecutor(new eleremove());


        //这上面注册两个就没问题 注册四个直接寄 (三个也不行)

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        //关闭信息
        getLogger().info(ChatColor.AQUA+"元素(Element) 已关闭");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return super.onCommand(sender, command, label, args);
    }
}




