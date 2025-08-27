const { io } = require('../config/server');
io.on('connection', (socket) => {
    console.log('User connected:', socket.id);
    socket.on('join-chat', (chatId) => {
        socket.join(chatId);
        console.log(`User ${socket.id} joined chat ${chatId}`);
    });
    socket.on('send-message', (data) => {
        socket.to(data.chatId).emit('new-message', data);
    });
    socket.on('disconnect', () => {
        console.log('User disconnected:', socket.id);
    });
});