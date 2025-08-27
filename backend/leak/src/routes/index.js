const express = require('express');
const authRoutes = require('./auth');
const messageRoutes = require('./messages');
const userRoutes = require('./users');
const router = express.Router();
router.use('/auth', authRoutes);
router.use('/messages', messageRoutes);
router.use('/users', userRoutes);
module.exports = router;