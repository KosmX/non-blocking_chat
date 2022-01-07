# Non-blocking chat lookup

On a chat message, the client will check if that player is blocked or not.  
This is an API lookup. But **this does not happen on a thread**.  

This will cause a lag on every (or some) chat message.  

This mod aims to fix that, by doing the chat message handling on other threads.

## Alternative solution
*Almost* noone is using the chat restriction, for them, it is faster to avoid the whole API lookup:  
mod doing that by @adryd325  
[adryd325/chat-lag-fix/](https://github.com/adryd325/chat-lag-fix/)  


## Setup

For setup instructions please see the [fabric wiki page](https://fabricmc.net/wiki/tutorial:setup) that relates to the IDE that you are using.

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.
