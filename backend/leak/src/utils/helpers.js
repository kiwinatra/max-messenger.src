const formatMessage = (message) => ({
    id: message._id,
    content: message.content,
    sender: message.sender,
    timestamp: message.timestamp
});
module.exports = { formatMessage };