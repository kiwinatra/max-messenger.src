const express = require('express');
const { getMessages, sendMessage } = require('../controllers/messageController');
const auth = require('../middleware/auth');
const router = express.Router();
router.get('/:chatId', auth, getMessages);
router.post('/', auth, sendMessage);
module.exports = router;