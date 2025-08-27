const mongoose = require('mongoose');
const chatSchema = new mongoose.Schema({
    name: { type: String, required: true },
    participants: [{ type: mongoose.Schema.Types.ObjectId, ref: 'User' }],
    isGroup: { type: Boolean, default: false }
});
module.exports = mongoose.model('Chat', chatSchema);