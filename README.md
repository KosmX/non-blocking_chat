# Non-blocking chat lookup

On a chat message, the client will check if that player is blocked or not.  
This is an API lookup. But **this does not happen on a thread**.  

This will cause a lag on every (or some) chat message.  

This mod aims to fix that, by doing the chat message handling on other threads.

## Alternative solution
*Almost* noone is using the chat restriction, for them, it is faster to avoid the whole API lookup:  
mod doing that by @adryd325  
[adryd325/chat-lag-fix/](https://github.com/adryd325/chat-lag-fix/)  

And the proper caching of the blocked user list is part of Blanket!:  
[Blanket/.../YggdrasilUserApiService_syncBlockListMixin.java](https://github.com/BlanketMC/blanket-client-tweaks/blob/1.18/src/main/java/io/github/blanketmc/blanket/mixin/fixes/YggdrasilUserApiService_syncBlockListMixin.java)  
[CurseForge/Blanket](https://www.curseforge.com/minecraft/mc-mods/blanket)

## Setup

For setup instructions please see the [fabric wiki page](https://fabricmc.net/wiki/tutorial:setup) that relates to the IDE that you are using.

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.
