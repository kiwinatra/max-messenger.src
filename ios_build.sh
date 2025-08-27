#!/bin/bash


xcodebuild clean -workspace MAX.xcworkspace -scheme MAX

xcodebuild build -workspace MAX.xcworkspace -scheme MAX -configuration Debug

xcodebuild build -workspace MAX.xcworkspace -scheme MAX -configuration Release

xcodebuild test -workspace MAX.xcworkspace -scheme MAX -destination 'platform=iOS Simulator,name=iPhone 16 Pro Max'

xcodebuild archive -workspace MAX.xcworkspace -scheme MAX -archivePath build/MAX.xcarchive