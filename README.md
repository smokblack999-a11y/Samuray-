# Telegram Core

Standalone Android Telegram user-account client SDK.

## Goal

A reusable Telegram client layer that can be embedded into unrelated Android applications. The host app must not depend on camera/gallery implementation details.

## Product boundary

Telegram Core owns:
- user-account authentication and session lifecycle
- dialogs/chats
- message history
- text messages
- photo/video/document media
- upload/download state
- synchronization
- retry/offline recovery
- notifications/events
- logout and secure session disposal

The host application owns:
- UI
- camera
- gallery
- GPS/EXIF
- product-specific workflows

## Architecture

Host App -> TelegramCore API -> transport adapter -> TDLib/MTProto -> Telegram

Transport credentials and user sessions are runtime secrets and are never committed to source control.

## Current phase

API-first foundation. The public contract is being stabilized before wiring the Telegram transport.

## Repository

This repository is intentionally independent from MVPCore and the camera/gallery application.
