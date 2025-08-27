const Message = require('../models/Message');
const getMessages = async (req, res) => {
    try {
        const messages = await Message.find({ chat: req.params.chatId }).populate('sender', 'email');
        res.json(messages);
    } catch (error) {
        res.status(500).json({ error: 'Server error' });
    }
};
const sendMessage = async (req, res) => {
    const { content, chatId } = req.body;
    try {
        const message = new Message({ content, sender: req.userId, chat: chatId });
        await message.save();
        await message.populate('sender', 'email');
        res.status(201).json(message);
    } catch (error) {
        res.status(500).json({ error: 'Server error' });
    }
};
module.exports = { getMessages, sendMessage };